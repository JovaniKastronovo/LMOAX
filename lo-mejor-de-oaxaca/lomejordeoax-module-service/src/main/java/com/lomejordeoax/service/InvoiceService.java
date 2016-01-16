package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.model.sales.enums.InvoiceStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface InvoiceService {	
	void saveInvoice(Invoice invoice)throws BusinessException;
	void updateInvoice(Invoice invoice)throws BusinessException;
	Invoice invoiceById(Integer invoiceId)throws BusinessException;
	void updInvoiceStatus(InvoiceStatus status,Integer invoiceId)throws BusinessException;
	List<Invoice> getInvoiceByStatus(InvoiceStatus status)throws BusinessException;
}
