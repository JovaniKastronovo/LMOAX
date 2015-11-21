package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface SaleService {
	
	void saveSale(Sale sale)throws BusinessException;
	void updSale(Sale sale)throws BusinessException;
	List<Sale> getSalesByStatus(SaleStatus status)throws BusinessException;
	List<Sale> getSalesBySucursal(Integer sucursalId)throws BusinessException;
	List<Sale> getSalesByCustomerId(Integer customerId)throws BusinessException;
}
