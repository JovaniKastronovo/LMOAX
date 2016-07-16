package com.lomejordeoax.test;

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
public class GetPhotoByProductIdTest {
	
	private static final Integer PRODUCT_ID = 1;
	
	@Autowired
	private ProductPhotoManager producPhotoManager;
	
	@Test
	public void getPhotosByProductId() throws BusinessException{
		List<ProductPhotos> photos = producPhotoManager.getPhotosByProductId(PRODUCT_ID);
		Assert.assertNotNull(photos);
	}

}
