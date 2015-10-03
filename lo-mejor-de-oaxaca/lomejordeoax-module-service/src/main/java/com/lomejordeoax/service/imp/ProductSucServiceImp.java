package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.ProductSucursalDao;
import com.lomejordeoax.service.ProductSucursalService;

@Service("productSucService")
public class ProductSucServiceImp implements ProductSucursalService {
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);
	
	@Autowired
	private ProductSucursalDao productSucDao;	

	@Transactional
	@Override
	public void saveProdSuc(ProductSucursal newProdSuc)
			throws BusinessException {
		try {
			productSucDao.save(newProdSuc);
		} catch (DataException e) {
			logger.error("Error saving product sucursal="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void updateProdSuc(ProductSucursal updProdSuc)
			throws BusinessException {
		try {
			productSucDao.update(updProdSuc);
		} catch (DataException e) {
			logger.error("Error saving product sucursal="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Override
	public List<ProductSucursal> getProdBySucursal(Integer sucursalId)
			throws BusinessException {
		return productSucDao.getProdBySucursal(sucursalId);
	}

	@Override
	public List<ProductSucursal> findProdSucById(String productId,
			Integer sucursalId) throws BusinessException {
		return productSucDao.findProdSucById(productId, sucursalId);
	}

	@Override
	public List<ProductSucursal> getProdSucByStock(double minStock)
			throws BusinessException {
		return productSucDao.getProdSucByStock(minStock);
	}

}
