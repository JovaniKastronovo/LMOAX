package com.lomejordeoax.test;

import java.util.List;

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
	private static Integer CUSTOMER_ID = 1;
	private static Integer SUCURSAL_ID = 1;
	
	@Autowired
	private SaleService saleService;
	
	@Test
	public void updSale() throws BusinessException{
		Sale saleToUpd = getSale(SALE_ID);
		Assert.assertNotNull("The sale id shoult not be null", saleToUpd);
		//Update sale status
		saleToUpd.setSale_status_id(SaleStatus.ACTIVE.getStatusId());
		saleService.updSale(saleToUpd);
		Assert.assertTrue("Status it's not equals to "+SaleStatus.ACTIVE.getStatusId(),
				SaleStatus.ACTIVE.getStatusId().equals(saleToUpd.getSale_status_id()));
		Assert.assertNotNull(saleToUpd.getSale_status_id());
	}
	
	public Sale getSale(Integer saleId) throws BusinessException{
		return saleService.saleById(saleId);
	}
		
	@Test
	public void saleByStatus() throws BusinessException{
		List<Sale> saleList= saleService.getSalesByStatus(SaleStatus.ACTIVE);
		Assert.assertNotNull(saleList);
	}
	
	@Test
	public void saleByCustomer() throws BusinessException{
		List<Sale> saleList= saleService.getSalesByCustomerId(CUSTOMER_ID);
		Assert.assertNotNull(saleList);
	}
	
	@Test
	public void saleBySucursal() throws BusinessException{
		List<Sale> saleList= saleService.getSalesBySucursal(SUCURSAL_ID);
		Assert.assertNotNull(saleList);
	}
	
}
