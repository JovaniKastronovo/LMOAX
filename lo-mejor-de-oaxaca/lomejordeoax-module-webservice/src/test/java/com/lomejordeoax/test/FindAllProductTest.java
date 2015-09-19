package com.lomejordeoax.test;

import java.util.List;

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
public class FindAllProductTest {

	@Autowired
	private ProductService productService;
	
	
	@Test
	public void findAllProduct() throws BusinessException{
		List<Product> products= productService.findAllProduct();
		Assert.assertNotNull(products);
		Assert.assertTrue(products.size()>0);
	}
}
