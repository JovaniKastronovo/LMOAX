package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.SaleDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("saleDao")
public class SaleDaoImp extends HGenericDaoImp<Sale, Integer> implements SaleDao {
	
	private static final String SALE_BY_STATUS_HQL = "from Sales s where s.status_id = ?";
	private static final String SALE_BY_SUCURSAL_HQL =  "from Sales s where s.sucursal_id = ?";
	private static final String SALE_BY_CUSTOMER = "from Sales s where s.customer_id = ?";

	@Override
	public List<Sale> getSalesByStatus(SaleStatus status) throws DataException {
		List<?> result= getHibernateTemplate().find(SALE_BY_STATUS_HQL, status.getStatusId());
		return (List<Sale>) result;
	}

	@Override
	public List<Sale> getSalesBySucursal(Integer sucursalId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(SALE_BY_SUCURSAL_HQL, sucursalId);
		return (List<Sale>) result;
	}

	@Override
	public List<Sale> getSalesByCustomerId(Integer customerId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(SALE_BY_CUSTOMER, customerId);
		return (List<Sale>) result;
	}

}
