package com.lomejordeoax.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.SaleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class QuerySaleTest {
	
	private static Integer SALE_ID = 6;
	
	@Autowired
	private SaleService saleService;
	
	@Test
	public void updSale() throws BusinessException{
		Sale saleToUpd = getSale(SALE_ID);
		Assert.assertNotNull(saleToUpd);
		Assert.assertNotNull("The sale id shoult not be null", saleToUpd);
		//Update sale status
		saleToUpd.setStatus_id(SaleStatus.ACTIVE.getStatusId());
		saleService.updSale(saleToUpd);
		Assert.assertTrue("Status it's not equals to "+SaleStatus.ACTIVE.getStatusId(),
				SaleStatus.ACTIVE.getStatusId().equals(saleToUpd.getStatus_id()));
		Assert.assertNotNull(saleToUpd.getStatus_id());
	}
	
	public Sale getSale(Integer saleId) throws BusinessException{
		return saleService.saleById(saleId);
	}	
	
}
