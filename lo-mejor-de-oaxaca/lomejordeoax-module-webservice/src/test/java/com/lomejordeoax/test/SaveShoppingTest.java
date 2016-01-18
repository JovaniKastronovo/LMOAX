package com.lomejordeoax.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.model.sales.MethodOfPayment;
import org.lomejordeoax.model.sales.enums.ShoppingStatus;
import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.model.shopping.ShoppingDetail;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ShoppingService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveShoppingTest {

	private static Integer SUCURSAL_ID = 1;
	private static Integer EMPLOYEE_ID = 1;
	private static Integer METHOD_OF_PAYMENT_ID = 1;
	private static Integer PROVIDER_ID = 1;
	
	@Autowired
	private ShoppingService shoppingService;	
	
	private Shopping shopping;
	
	@Before
	public void initData(){
		shopping = new Shopping();
	}
	
	@Test
	public void saveShopping() throws BusinessException{
		preparateShopping();
		shoppingService.saveShopping(shopping);
		Assert.assertNotNull(shopping);
		Assert.assertNotNull("The shopping id should not be null",shopping.getShopping_id());
	}
	
	private void preparateShopping(){
		shopping.setEmployee_id(EMPLOYEE_ID);
		shopping.setProvider_id(PROVIDER_ID);
		shopping.setShopping_status_id(ShoppingStatus.ACTIVE.getStatusId());
		shopping.setSucursal_id(SUCURSAL_ID);
		
		MethodOfPayment methodOfPay = getMethodOfPayment();
		List<ShoppingDetail> shoppingDetailsList = getShoppingDetails();
		
		shopping.setMethodOfPayment(methodOfPay);
		shopping.setShoppingDetails(shoppingDetailsList);
		shopping.setDelivery_date(new Date());
		shopping.setCreated_date(new Date());
		shopping.setModification_date(new Date());
		shopping.setPurchase_date(new Date());
	}
	
	private  List<ShoppingDetail> getShoppingDetails(){
		List<ShoppingDetail> shoppingDetailList = new ArrayList<ShoppingDetail>();
		
		ShoppingDetail shopDetails1 = new ShoppingDetail();
		shopDetails1.setQuantity(2.0);
		shopDetails1.setPrice(65.50);
		shopDetails1.setDiscount(0);
		//Add product
		Product product1 = new Product();
		product1.setProduct_id("ABALAC9");
		shopDetails1.setProduct(product1);
		
		
		ShoppingDetail shopDetails2 = new ShoppingDetail();
		shopDetails2.setQuantity(5);
		shopDetails2.setPrice(15.25);
		shopDetails2.setDiscount(10);
		//Add product
		Product product2 = new Product();
		product2.setProduct_id("ABALAC8");
		shopDetails2.setProduct(product2);
				
		shoppingDetailList.add(shopDetails1);
		shoppingDetailList.add(shopDetails2);
		
		return shoppingDetailList;
	}
	
		
	private MethodOfPayment getMethodOfPayment(){
		MethodOfPayment methodOfPay= new MethodOfPayment();
		methodOfPay.setMethod_payment_id(METHOD_OF_PAYMENT_ID);		
		return methodOfPay;
	}
}
