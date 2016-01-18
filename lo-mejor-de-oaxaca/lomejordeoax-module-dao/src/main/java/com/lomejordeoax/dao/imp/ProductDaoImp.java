package com.lomejordeoax.dao.imp;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ProductDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;


@Repository("productDao")
public class ProductDaoImp extends HGenericDaoImp<Product, String> implements ProductDao{

	@Override
	public Integer getNextProductId(Integer companyId) throws DataException {
		try {
			Session session= getHibernateTemplate().getSessionFactory().openSession();
			SQLQuery sqlQuery =session.createSQLQuery("CALL SP_PROD_SEQ_BY_COMPANY(:pi_company_id)");	
			sqlQuery.setInteger("pi_company_id", companyId);
			return (Integer)sqlQuery.uniqueResult();
		} catch (Exception e) {
			throw e;
		}		
	}

}
