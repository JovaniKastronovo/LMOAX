package com.lomejordeoax.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class GetNextProductIdTest {
	
	private static int COMPANY_ID = 1;
	
	@Autowired
	private ProductService productService;
	
	@Test
	public void getNextProductId() throws BusinessException{
		int nextProductId=productService.getNextProductId(COMPANY_ID);
		Assert.assertTrue("Tiene que ser mayor que cero", nextProductId>0);
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	
}
