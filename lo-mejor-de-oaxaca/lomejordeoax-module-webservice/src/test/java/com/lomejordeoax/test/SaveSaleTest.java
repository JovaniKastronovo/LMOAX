package com.lomejordeoax.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.model.sales.DocumentSale;
import org.lomejordeoax.model.sales.MethodOfPayment;
import org.lomejordeoax.model.sales.SaleDetails;
import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.TypeOfCurrency;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.SaleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveSaleTest {

	private static Integer SUCURSAL_ID = 1;
	private static Integer CUSTOMER_ID = 2;
	private static Integer EMPLOYEE_ID = 1;
	private static Integer METHOD_OF_PAYMENT_ID = 1;
	private static Integer DOCUMENT_SALE_ID = 1;
	private static Integer TYPE_OF_CURRENCY_ID = 1;
	
	@Autowired
	private SaleService saleService;	
	
	private Sale sale;
	
	@Before
	public void initData(){
		sale = new Sale();
	}
	
	@Test
	public void saveSale() throws BusinessException{
		preparateSale();
		saleService.saveSale(sale);
		Assert.assertNotNull(sale);
		Assert.assertNotNull("The sale id should not be null",sale.getSale_id());
	}
	
	private void preparateSale(){
		sale.setEmployee_id(EMPLOYEE_ID);
		sale.setCustomer_id(CUSTOMER_ID);
		sale.setStatus_id(SaleStatus.ACTIVE.getStatusId());
		sale.setSucursal_id(SUCURSAL_ID);
		
		DocumentSale docSale = getDocumentSale();
		TypeOfCurrency typOfCurr = getTypeOfCurrency();
		MethodOfPayment methodOfPay = getMethodOfPayment();
		List<SaleDetails> saleDetailsList = getSalesDetails();
		
		sale.setDocumentSale(docSale);		
		sale.setTypeOfCurrency(typOfCurr);
		sale.setMethodOfPayment(methodOfPay);
		sale.setSaleDetails(saleDetailsList);
		sale.setDelivery_date(new Date());
		sale.setCreated_date(new Date());
		sale.setModification_date(new Date());
	}
	
	private  List<SaleDetails> getSalesDetails(){
		List<SaleDetails> saleDetailsList = new ArrayList<SaleDetails>();
		
		SaleDetails saleDetails1 = new SaleDetails();
		saleDetails1.setQuantity(2.0);
		saleDetails1.setPrice(65.50);
		saleDetails1.setDiscount(0);
		//Add product
		Product product1 = new Product();
		product1.setProduct_id("ABALAC3");
		saleDetails1.setProduct(product1);
		
		
		SaleDetails saleDetails2 = new SaleDetails();
		saleDetails2.setQuantity(5);
		saleDetails2.setPrice(15.25);
		saleDetails2.setDiscount(10);
		//Add product
		Product product2 = new Product();
		product2.setProduct_id("ABALAC8");
		saleDetails2.setProduct(product2);
				
		saleDetailsList.add(saleDetails1);
		saleDetailsList.add(saleDetails2);
		
		return saleDetailsList;
	}
	
	private DocumentSale getDocumentSale(){
		DocumentSale docSale = new DocumentSale();
		docSale.setDocument_sale_id(DOCUMENT_SALE_ID);
		return docSale;
	}
	
	private TypeOfCurrency getTypeOfCurrency(){
		TypeOfCurrency typeOfCurrency = new TypeOfCurrency();
		typeOfCurrency.setType_of_currency_id(TYPE_OF_CURRENCY_ID);
		return typeOfCurrency;
	}
	
	private MethodOfPayment getMethodOfPayment(){
		MethodOfPayment methodOfPay= new MethodOfPayment();
		methodOfPay.setMethod_payment_id(METHOD_OF_PAYMENT_ID);		
		return methodOfPay;
	}
}
