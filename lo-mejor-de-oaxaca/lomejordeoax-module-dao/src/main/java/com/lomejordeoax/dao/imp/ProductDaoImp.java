package com.lomejordeoax.dao.imp;

import java.math.BigInteger;

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
	public Integer getNextProductId() throws DataException {
		try {
			Session session= getHibernateTemplate().getSessionFactory().openSession();
			SQLQuery sqlQuery =session.createSQLQuery("CALL SP_NEXT_PRODUCT_ID");	
			return ((BigInteger)sqlQuery.uniqueResult()).intValue();
		} catch (Exception e) {
			throw e;
		}		
	}

}
