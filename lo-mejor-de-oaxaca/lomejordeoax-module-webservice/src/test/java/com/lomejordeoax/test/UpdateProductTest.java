package com.lomejordeoax.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class UpdateProductTest {

	private static String PRODUCT_ID = "ABAREF20";
	private static String UPD_DESCRIPTION = "Que quesillo";
	
	@Autowired
	private ProductService productService;
	
	@Test
	public void updateNameOfProduct() throws BusinessException{	
		Product productToUpd = findProduct();
		productService.updateProduct(productToUpd);
		Assert.assertTrue(productToUpd.getDescription().equals(UPD_DESCRIPTION));
	}

	private Product findProduct() throws BusinessException{
		Product productToUpd = productService.findProductById(PRODUCT_ID);
		Assert.assertNotNull(productToUpd);
		productToUpd.setDescription(UPD_DESCRIPTION);	
		return productToUpd;
	}
}
