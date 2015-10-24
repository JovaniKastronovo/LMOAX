package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface ProductTaxesDao extends HGenericDao<ProductTaxes,Integer> {
	List<ProductTaxes> findTaxesByProdId(String productId) throws DataException;
}
