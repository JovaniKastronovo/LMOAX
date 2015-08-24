package com.lomejordeoax.dao.generic.imp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.lomejordeoax.dao.generic.HGenericDao;

public class HGenericDaoImp<Entity, PK extends Serializable> implements
		HGenericDao<Entity, PK> {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	private Class<Entity> domainClass;
	
	@SuppressWarnings("unchecked")
	public HGenericDaoImp(){
		ParameterizedType thisType = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.domainClass = (Class<Entity>)thisType.getActualTypeArguments()[0];
	}

	@Override
	public void save(Entity entity) throws DataException {
		try{
			getHibernateTemplate().save(entity);
		}catch (DataAccessException e) {
			throw new DataException("Error to saving "+domainClass.getName(),e);
		}
	}

	@Override
	public void update(Entity entity) throws DataException {
		try{
			getHibernateTemplate().update(entity);
		}catch (DataAccessException e) {
			throw new DataException("Error to updating "+domainClass.getName(),e);
		}

	}

	@Override
	public Entity find(PK id) throws DataException {
		try {
			return getHibernateTemplate().load(domainClass, id);
		} catch (DataAccessException e) {
			throw new DataException(e.getMessage());
		}
	}

	@Override
	public void delete(Entity entity) throws DataException {
		try {
			getHibernateTemplate().delete(entity);
		} catch (DataAccessException e) {
			throw new DataException(e.getMessage());
		}
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}	

}
