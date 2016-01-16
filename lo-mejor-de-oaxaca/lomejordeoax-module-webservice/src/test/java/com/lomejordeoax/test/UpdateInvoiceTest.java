package com.lomejordeoax.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.model.sales.enums.InvoiceStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.InvoiceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class UpdateInvoiceTest {
		
	private static final Integer INVOICE_ID = 2;

	@Autowired
	private InvoiceService invoiceService;
	
	private Invoice invoice;
	
	@Before
	public void initData(){
		invoice = new Invoice();
	}
	
	@Test
	public void updInvoice() throws BusinessException{
		optainInvoiceById();
		invoice.setInvoice_status_id(InvoiceStatus.CANCELED.getStatusId());
		invoiceService.updateInvoice(invoice);		
		Assert.assertNotNull(invoice);		
		Assert.assertNotNull(invoice.getInvoice_id());	
		Assert.assertTrue(invoice.getInvoice_status_id() == InvoiceStatus.CANCELED.getStatusId());
	}
	
	private Invoice optainInvoiceById() throws BusinessException{
		invoice = invoiceService.invoiceById(INVOICE_ID);
		return invoice;
	};
}
