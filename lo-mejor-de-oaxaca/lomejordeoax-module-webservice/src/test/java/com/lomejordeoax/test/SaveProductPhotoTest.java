package com.lomejordeoax.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.bll.ProductPhotoManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveProductPhotoTest {
	
	@Autowired
	private ProductPhotoManager producPhotoManager;
	
	@Test
	public void savePhotos() throws BusinessException{
		List<ProductPhotos> photos = preparePhotos();
		for (ProductPhotos productPhotos : photos) {
			producPhotoManager.savePhotos(productPhotos);
			Assert.assertNotNull(productPhotos);
			Assert.assertNotNull(productPhotos.getProduct_photos_id());
		}
	}
	
	private List<ProductPhotos> preparePhotos(){
		ProductPhotos pPhoto = new ProductPhotos();
		pPhoto.setCreated_date(new Date());
		pPhoto.setModification_date(new Date());
		pPhoto.setPath("/company/1/products/photos/picture01");
		pPhoto.setProduct_id(1);
		
		ProductPhotos pPhoto2 = new ProductPhotos();
		pPhoto2.setActive(true);
		pPhoto2.setCreated_date(new Date());
		pPhoto2.setModification_date(new Date());
		pPhoto2.setPath("/company/1/products/photos/picture02");
		pPhoto2.setProduct_id(1);
		
		
		List<ProductPhotos> photos = new ArrayList<ProductPhotos>();
		photos.add(pPhoto);
		photos.add(pPhoto2);
		
		return photos;
	}

}
