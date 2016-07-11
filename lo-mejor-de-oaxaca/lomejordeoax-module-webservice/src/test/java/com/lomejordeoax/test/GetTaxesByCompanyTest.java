package com.lomejordeoax.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.bll.TaxManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class GetTaxesByCompanyTest {
	
	private Integer COMPANY_ID = 1;
	
	@Autowired
	private TaxManager taxManager;

	@Test
	public void getTaxByCompany() throws BusinessException{
		List<Taxes> taxes = taxManager.getTaxesByCompany(COMPANY_ID);		
		Assert.assertNotNull(taxes);		
	}
}
