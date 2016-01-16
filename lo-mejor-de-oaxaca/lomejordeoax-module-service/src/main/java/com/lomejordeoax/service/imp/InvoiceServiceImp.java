package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.model.sales.enums.InvoiceStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.InvoiceDao;
import com.lomejordeoax.service.InvoiceService;

@Service("invoiceService")
public class InvoiceServiceImp implements InvoiceService {
	
	private static Logger logger = Logger.getLogger(InvoiceServiceImp.class);
	
	@Autowired
	private InvoiceDao invoiceDao;

	@Transactional
	@Override
	public void updInvoiceStatus(InvoiceStatus status, Integer invoiceId)
			throws BusinessException {
		try {
			logger.info("Find invoice by invoice id");
			Invoice invoice = invoiceDao.find(invoiceId);
			logger.info("Invoice found:"+invoice.toString());		
			logger.info("Set invoice status id to :"+status.getStatusId());
			invoice.setInvoice_status_id(status.getStatusId());	
			logger.info("Update invoice status");
			invoiceDao.update(invoice);
			logger.info("Update successfully");
		} catch (DataException e) {
			logger.error("Failed invoice status update="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}

	}

	@Transactional(readOnly= true)
	@Override
	public List<Invoice> getInvoiceByStatus(InvoiceStatus status)
			throws BusinessException {
		if(status!=null){
			try {
				List<Invoice> invoices = invoiceDao.getInvoiceByStatus(status.getStatusId());
				return invoices;
			} catch (DataException e) {
				logger.error("Invoice status with "+status.getStatusId()+" not found",e);
				throw new BusinessException("Invoices no found",e);
			}			
		}else
			throw new BusinessException("Status is required");
	}

	@Transactional
	@Override
	public void saveInvoice(Invoice invoice) throws BusinessException {
		try {
			invoiceDao.save(invoice);
		} catch (DataException e) {
			logger.error("Error saving invoice="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}		
	}

	@Transactional
	@Override
	public void updateInvoice(Invoice invoice) throws BusinessException {
		try {
			invoiceDao.update(invoice);
		} catch (DataException e) {
			logger.error("Error updating invoice="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}		
	}

	@Transactional(readOnly = true)
	@Override
	public Invoice invoiceById(Integer invoiceId) throws BusinessException {
		if(invoiceId!=null){
			try {
				Invoice invoice = invoiceDao.find(invoiceId);
				return invoice;
			} catch (DataException e) {
				logger.error("Invoice "+invoiceId+" not found",e);
				throw new BusinessException("Invoice no found",e);
			}
		}else
			throw new BusinessException("InvoiceId is required");
		
	}
}
