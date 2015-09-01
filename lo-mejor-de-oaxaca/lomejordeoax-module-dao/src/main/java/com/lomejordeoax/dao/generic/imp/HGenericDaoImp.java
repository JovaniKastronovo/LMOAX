package com.lomejordeoax.dao.generic.imp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public void save(Entity entity){
		getHibernateTemplate().save(entity);
	}

	@Transactional
	@Override
	public void update(Entity entity){
		getHibernateTemplate().update(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public Entity find(PK id){
		return getHibernateTemplate().load(domainClass, id);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Entity> findAll(){
		return (List<Entity>) getHibernateTemplate()
					.find("from "+domainClass.getSimpleName());
	}

	@Override
	@Transactional
	public void delete(Entity entity){
		getHibernateTemplate().delete(entity);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}	

}
