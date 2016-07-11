package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface ProductPhotoDao extends HGenericDao<ProductPhotos, Integer> {
	List<ProductPhotos> getPhotosByProductId(Integer productId) throws DataException;
}
