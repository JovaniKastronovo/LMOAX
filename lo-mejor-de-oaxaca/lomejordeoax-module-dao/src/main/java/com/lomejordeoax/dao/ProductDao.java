package com.lomejordeoax.dao;

import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface ProductDao extends HGenericDao<Product, String>{
	Integer getNextProductId() throws DataException;
}
