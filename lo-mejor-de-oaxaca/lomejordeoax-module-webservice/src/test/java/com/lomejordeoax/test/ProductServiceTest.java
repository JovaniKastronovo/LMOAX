package com.lomejordeoax.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class ProductServiceTest {
	
	@Autowired
	private ProductService productService;
	private Product product;
	
	@Before
	public void initData(){
		product = new Product();
	}
	
	public void saveProduct() throws BusinessException{
		productService.saveProduct(product);
	}

}
