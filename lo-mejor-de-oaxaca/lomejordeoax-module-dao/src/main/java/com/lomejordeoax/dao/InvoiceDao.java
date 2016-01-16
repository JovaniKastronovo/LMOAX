package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface InvoiceDao extends HGenericDao<Invoice, Integer> {
	List<Invoice> getInvoiceByStatus(Integer statusId)throws DataException;	
}
