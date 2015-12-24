package com.lomejordeoax.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ProductTaxeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class ProductTaxesTest {

	private static String PRODUCT_ID = "ABALAC8";
	private static Integer TAXE_ID = 1;
	
	@Autowired
	private ProductTaxeService productTaxeService;	
	
	private ProductTaxes productTaxes;
	
	@Before
	public void initData(){
		productTaxes = new ProductTaxes();
	}
	
	@Test
	public void saveProductTaxes() throws BusinessException{
		preparateProdTax();
		productTaxeService.saveProdTax(productTaxes);
		Assert.assertNotNull(productTaxes);
		Assert.assertNotNull("The product tax id should not be null",productTaxes.getProduct_taxe_id());
	}
	
	private void preparateProdTax(){
		Taxes taxe = new Taxes();
		taxe.setTax_id(TAXE_ID);
		productTaxes.setProduct_id(PRODUCT_ID);
		productTaxes.setTaxes(taxe);
		productTaxes.setOrderr(1);
		productTaxes.setCreated_date(new Date());
		productTaxes.setModification_date(new Date());
	}
}
