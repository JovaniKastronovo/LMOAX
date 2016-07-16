package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface ProductPhotoService {
	void saveProductPhoto(ProductPhotos phoductPhoto)throws BusinessException;
	void updProductPhoto(ProductPhotos phoductPhoto)throws BusinessException;
	ProductPhotos getProdPhotoById(Integer productPhotoId)throws BusinessException;
	List<ProductPhotos> getPhotosByProductId(Integer productId)throws BusinessException;
}
