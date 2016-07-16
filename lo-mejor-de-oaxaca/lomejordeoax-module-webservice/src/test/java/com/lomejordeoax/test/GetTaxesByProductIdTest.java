package com.lomejordeoax.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.bll.TaxManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class GetTaxesByProductIdTest {
	
	private Integer PRODUCT_ID = 1;
	
	@Autowired
	private TaxManager taxManager;

	@Test
	public void getTaxesByProductId() throws BusinessException{
		List<ProductTaxes> taxes = taxManager.findTaxByProductId(PRODUCT_ID);		
		Assert.assertNotNull(taxes);		
	}
}
