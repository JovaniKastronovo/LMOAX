package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.sales.enums.ShoppingStatus;
import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.ShoppingDao;
import com.lomejordeoax.service.ShoppingService;

@Service("shoppingService")
public class ShoppingServiceImp implements ShoppingService {

	private static Logger logger = Logger.getLogger(ShoppingServiceImp.class);
	
	@Autowired
	private ShoppingDao shoopingDao;
	
	@Transactional
	@Override
	public void saveShopping(Shopping newShopping) throws BusinessException {
		try {
			shoopingDao.save(newShopping);
		} catch (DataException e) {
			logger.error("Error saving shopping="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void updShopping(Shopping shopping) throws BusinessException {
		try {
			shoopingDao.update(shopping);
		} catch (DataException e) {
			logger.error("Failed update shopping="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Override
	public List<Shopping> shoppingByStatus(ShoppingStatus status)
			throws BusinessException {
		try {
			return shoopingDao.shoppingByStatus(status);
		} catch (DataException e) {
			throw new BusinessException("Error getting shopping by statu id ="+status.getStatusId(),e);
		}
	}

	@Override
	public List<Shopping> shoppingBySucursal(Integer sucursalId)
			throws BusinessException {
		try {
			return shoopingDao.shoppingBySucursal(sucursalId);
		} catch (DataException e) {
			throw new BusinessException("Error getting shoping by sucursalId = "+sucursalId,e);
		}
	}

	@Override
	public List<Shopping> shoppingByEmployeeId(Integer employeeId)
			throws BusinessException {
		try {
			return shoopingDao.shoppingByEmployeeId(employeeId);
		} catch (DataException e) {
			throw new BusinessException("Error getting shopping by employeeId="+employeeId,e);
		}
	}

	@Override
	public Shopping shoppingById(Integer shoppingId) throws BusinessException {
		if(shoppingId!=null){
			try {
				Shopping shopping = shoopingDao.find(shoppingId);
				return shopping;
			} catch (DataException e) {
				logger.error("Shopping "+shoppingId+" not found",e);
				throw new BusinessException("Shopping not found",e);
			}
		}else
			throw new BusinessException("Shopping Id required");
	}

}
