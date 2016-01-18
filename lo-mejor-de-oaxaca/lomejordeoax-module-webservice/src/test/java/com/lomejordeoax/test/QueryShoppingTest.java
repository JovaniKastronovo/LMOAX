package com.lomejordeoax.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.model.sales.enums.ShoppingStatus;
import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ShoppingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class QueryShoppingTest {
	
	private static Integer SHOPPING_ID = 6;
	private static Integer EMPLOYEE_ID = 1;
	private static Integer SUCURSAL_ID = 1;
	
	@Autowired
	private ShoppingService shoppingService;
	
	@Test
	public void updShopping() throws BusinessException{
		Shopping shoppingToUpd = getShopping(SHOPPING_ID);
		Assert.assertNotNull("The shopping id should not be null", shoppingToUpd);
		//Update sale status
		shoppingToUpd.setShopping_status_id(SaleStatus.CANCELED.getStatusId());
		shoppingService.updShopping(shoppingToUpd);
		Assert.assertNotNull(shoppingToUpd.getShopping_status_id());
		Assert.assertTrue("Status it's not equals to "+SaleStatus.ACTIVE.getStatusId(),
				SaleStatus.CANCELED.getStatusId().equals(shoppingToUpd.getShopping_status_id()));		
	}
	
	public Shopping getShopping(Integer shoppingId) throws BusinessException{
		return shoppingService.shoppingById(shoppingId);
	}
		
	@Test
	public void shoppingByStatus() throws BusinessException{
		List<Shopping> shoppingList= shoppingService.shoppingByStatus(ShoppingStatus.CANCELED);
		Assert.assertNotNull(shoppingList);
	}
	
	@Test
	public void saleByEmployee() throws BusinessException{
		List<Shopping> shoppingList= shoppingService.shoppingByEmployeeId(EMPLOYEE_ID);
		Assert.assertNotNull(shoppingList);
	}
	
	@Test
	public void saleBySucursal() throws BusinessException{
		List<Shopping> shoppingList= shoppingService.shoppingBySucursal(SUCURSAL_ID);
		Assert.assertNotNull(shoppingList);
	}
	
}
