package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.sales.enums.ShoppingStatus;
import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface ShoppingService {
	
	void saveShopping(Shopping newShopping)throws BusinessException;
	void updShopping(Shopping shopping)throws BusinessException;
	List<Shopping> shoppingByStatus(ShoppingStatus status)throws BusinessException;
	List<Shopping> shoppingBySucursal(Integer sucursalId)throws BusinessException;
	List<Shopping> shoppingByEmployeeId(Integer employeeId)throws BusinessException;
	Shopping shoppingById(Integer shoppingId)throws BusinessException;
}
