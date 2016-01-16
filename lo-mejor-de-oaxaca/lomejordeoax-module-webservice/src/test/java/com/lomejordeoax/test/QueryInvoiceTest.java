package com.lomejordeoax.test;

import java.util.List;

import org.junit.Assert;
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
public class QueryInvoiceTest {

	@Autowired
	private InvoiceService invoiceService;
	
	@Test
	public void InvoiceByStatus() throws BusinessException{	
		
		List<Invoice> invoices=invoiceService.getInvoiceByStatus(InvoiceStatus.CANCELED);
		Assert.assertNotNull(invoices);
		for (Invoice invoice : invoices) {
			Assert.assertNotNull(invoice.getInvoice_id());
			boolean isCancelStatus =(invoice.getInvoice_status_id() == InvoiceStatus.CANCELED.getStatusId());
			Assert.assertTrue(isCancelStatus);
		}		
	}
}
