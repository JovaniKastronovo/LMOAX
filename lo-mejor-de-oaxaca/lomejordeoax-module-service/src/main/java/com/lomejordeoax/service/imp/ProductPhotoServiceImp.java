package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.ProductPhotoDao;
import com.lomejordeoax.service.ProductPhotoService;

@Service("productPhotoServ")
public class ProductPhotoServiceImp implements ProductPhotoService {
	
	private static Logger logger = Logger.getLogger(ProductPhotoServiceImp.class);
	
	@Autowired
	private ProductPhotoDao productPhotoDao;

	@Transactional
	@Override
	public void saveProductPhoto(ProductPhotos phoductPhoto)
			throws BusinessException {
		try {
			productPhotoDao.save(phoductPhoto);
		} catch (DataException e) {
			logger.error("Error saving photo="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void updProductPhoto(ProductPhotos phoductPhoto)
			throws BusinessException {
		try {
			productPhotoDao.update(phoductPhoto);
		} catch (DataException e) {
			logger.error("Error updating photo-->"+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
		
	}

	@Transactional(readOnly = true)
	@Override
	public List<ProductPhotos> getPhotosByProductId(Integer productId)
			throws BusinessException {
		try {
			return productPhotoDao.getPhotosByProductId(productId);
		} catch (DataException e){
			throw new BusinessException("The getPhotosByProductId failed",e);
		}
	}

	@Override
	public ProductPhotos getProdPhotoById(Integer productPhotoId)
			throws BusinessException {
		try {
			if(productPhotoId!=null)
				return productPhotoDao.find(productPhotoId);
			else
				throw new BusinessException("The product photo id is required");
		} catch (DataException e) {
			logger.error("Failed the product photo by id", e);
			throw new BusinessException("Get product photo by id failed, "+e.getMessage());
		}
	}
}
