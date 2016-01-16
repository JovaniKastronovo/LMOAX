package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface ShoppingDao extends HGenericDao<Shopping, Integer> {
	List<Shopping> shoppingByStatus(Integer shoppingStatusId)throws DataException;
	List<Shopping> shoppingBySucursal(Integer sucursalId)throws DataException;
	List<Shopping> shoppingByEmployeeId(Integer employeeId)throws DataException;
}
