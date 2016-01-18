package com.lomejordeoax.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.InvoiceStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.InvoiceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveInvoiceTest {
		
	private static final Integer SALE_ID = 2;

	@Autowired
	private InvoiceService invoiceService;
	
	private Invoice invoice;
	
	@Before
	public void initData(){
		invoice = new Invoice();
	}
	
	@Test
	public void saveInvoice() throws BusinessException{
		prepateInvoice();
		invoiceService.saveInvoice(invoice);		
		Assert.assertNotNull(invoice);		
		Assert.assertNotNull(invoice.getInvoice_id());	
	}
	
	private void prepateInvoice() throws BusinessException{
		
		invoice.setInvoice_date(new Date());
		invoice.setInvoice_status_id(InvoiceStatus.NEW.getStatusId());
		invoice.setFolio_fiscal("2bk-soo3i-jaskdm-38u4ns-sjd-mxs");
		invoice.setCertificado_sat("323549854545613");
		invoice.setFecha_hora_emision(new Date());
		invoice.setFecha_hora_cert(new Date());
		invoice.setCompl_cert_dig_sat("6232400|sdf232410|werwe100d-xlkdlkas62233240a-alsdkf.xkosdf");
		invoice.setSello_dig_emisor("MSODF415512100A,Mmx65656-askdjfj|lskdsdlmd");
		invoice.setSello_dig_sat("633odakdmdm93939-msnndkd.xjskjd,ksjdkfj;isjdifinnas39393");
		invoice.setRfc_receptor("ORIF212121OSD562");
		
		Sale sale = new Sale();
		sale.setSale_id(SALE_ID);
		
		invoice.setSale(sale);
		invoice.setCreated_date(new Date());
		invoice.setModification_date(new Date());
	}	
}
