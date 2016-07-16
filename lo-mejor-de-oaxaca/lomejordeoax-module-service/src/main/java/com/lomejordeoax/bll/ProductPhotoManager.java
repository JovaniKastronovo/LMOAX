package com.lomejordeoax.bll;

import java.util.Date;
import java.util.List;

import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomejordeoax.service.ProductPhotoService;

@Service("producPhotoManager")
public class ProductPhotoManager {
	
	@Autowired
	private ProductPhotoService productPhotoServ;
	
	public void savePhotos(ProductPhotos prodPhoto) throws BusinessException{
		if(prodPhoto!=null && prodPhoto.getProduct_id()!=null){
			productPhotoServ.saveProductPhoto(prodPhoto);
		}else
			throw new BusinessException("The product id is required");		
	}
	
	public void updatePhotos(ProductPhotos prodPhoto) throws BusinessException{
		if(prodPhoto!=null && prodPhoto.getProduct_id()!=null){
			productPhotoServ.updProductPhoto(prodPhoto);
		}else{
			throw new BusinessException("The product id is required");
		}
	}
	
	public List<ProductPhotos> getPhotosByProductId(Integer productId) throws BusinessException{
		if(productId!=null){
			return productPhotoServ.getPhotosByProductId(productId);
		}else{
			throw new BusinessException("The product id is required");
		}
	}
	
	public void activePhoto(Integer productId, Integer productPhotoId) throws BusinessException{
		if(productPhotoId!=null && productId!=null){
			List<ProductPhotos> prodPhotos= getPhotosByProductId(productId);
			for (ProductPhotos productPhotos : prodPhotos) {
				productPhotos.setModification_date(new Date());
				if(productPhotos.getProduct_photos_id().equals(productPhotoId)){
					productPhotos.setActive(true);
				}else{
					productPhotos.setActive(false);
				}	
				productPhotoServ.saveProductPhoto(productPhotos);
			}
		}else if(productPhotoId==null){
			throw new BusinessException("The product photo id is required");
		}else if(productId == null){
			throw new BusinessException("The product id is required");
		}
	}

}
