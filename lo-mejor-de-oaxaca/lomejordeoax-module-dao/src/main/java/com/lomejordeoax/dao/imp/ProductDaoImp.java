package com.lomejordeoax.dao.imp;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ProductDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;


@Repository("productDao")
public class ProductDaoImp extends HGenericDaoImp<Product, Integer> implements ProductDao{

	private static final String PRODUCTKEY_COMPANY_HQL = "from Product p where p.product_key = ?";
	
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
	
	@Override
	public Product findProdByKey(String productKey, Integer companyId)
			throws DataException {
		 List<?> productList = getHibernateTemplate().find(PRODUCTKEY_COMPANY_HQL, productKey);
		 if(productList!=null && productList.size()>0)
			 return (Product) productList.get(0);
		 
		return null;
	}

}
