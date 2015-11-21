package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface SaleDao extends HGenericDao<Sale, Integer> {
	List<Sale> getSalesByStatus(SaleStatus status)throws DataException;
	List<Sale> getSalesBySucursal(Integer sucursalId)throws DataException;
	List<Sale> getSalesByCustomerId(Integer customerId)throws DataException;
}
