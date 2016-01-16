package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.product.Invoice;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.InvoiceDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("invoiceDao")
public class InvoiceDaoImp extends HGenericDaoImp<Invoice, Integer> implements 
		InvoiceDao {
	
	private static final String INVOICE_BY_STATUS_HQL = "from Invoice i where i.invoice_status_id=?";
	
	@Transactional(readOnly = true)
	@Override
	public List<Invoice> getInvoiceByStatus(Integer statusId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(INVOICE_BY_STATUS_HQL, statusId);
		return ((List<Invoice>) result);
	}

}
