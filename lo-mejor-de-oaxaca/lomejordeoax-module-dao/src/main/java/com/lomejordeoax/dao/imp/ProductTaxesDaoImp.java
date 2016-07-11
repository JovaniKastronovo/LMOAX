package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ProductTaxesDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("productTaxesDao")
public class ProductTaxesDaoImp extends  HGenericDaoImp<ProductTaxes, Integer> 
		implements ProductTaxesDao {
	
	private static final String TAXES_BY_PROD_ID_HQL = "from ProductTaxes pt where pt.product_id = ?";

	@Override
	public List<ProductTaxes> findTaxesByProdId(Integer productId) throws DataException {
		List<?> result= getHibernateTemplate().find(TAXES_BY_PROD_ID_HQL, productId);
		return ((List<ProductTaxes>) result);
	}	
}
