package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.sales.Sale;
import org.lomejordeoax.model.sales.enums.SaleStatus;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.SaleDao;
import com.lomejordeoax.service.SaleService;

@Service("saleService")
public class SaleServiceImp implements SaleService {
	
	private static Logger logger = Logger.getLogger(SaleServiceImp.class);
	
	@Autowired
	private SaleDao saleDao;

	@Transactional
	@Override
	public void saveSale(Sale sale) throws BusinessException {
		try {
			saleDao.save(sale);
		} catch (DataException e) {
			logger.error("Error saving sale="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}	
	}

	@Transactional
	@Override
	public void updSale(Sale sale) throws BusinessException {
		try {
			saleDao.save(sale);
		} catch (DataException e) {
			logger.error("Error updating sale="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional(readOnly=true)
	@Override
	public List<Sale> getSalesByStatus(SaleStatus status) throws BusinessException {
		try {
			return saleDao.getSalesByStatus(status);
		} catch (DataException e) {
			throw new BusinessException("Error getting sales by statu id ="+status.getStatusId(),e);
		}
	}

	@Transactional(readOnly=true)
	@Override
	public List<Sale> getSalesBySucursal(Integer sucursalId) throws BusinessException {
		try {
			return saleDao.getSalesBySucursal(sucursalId);
		} catch (DataException e) {
			throw new BusinessException("Error getting sales by productId = "+sucursalId,e);
		}
	}

	@Transactional(readOnly=true)
	@Override
	public List<Sale> getSalesByCustomerId(Integer customerId) throws BusinessException {
		try {
			return saleDao.getSalesByCustomerId(customerId);
		} catch (DataException e) {
			throw new BusinessException("Error getting sales by customerId="+customerId,e);
		}
	}

}
