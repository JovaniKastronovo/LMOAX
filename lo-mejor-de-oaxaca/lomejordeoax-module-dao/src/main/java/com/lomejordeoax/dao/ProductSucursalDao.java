package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface ProductSucursalDao extends HGenericDao<ProductSucursal, Integer> {
	List<ProductSucursal> getProdBySucursal(Integer sucursalId)throws BusinessException;
	List<ProductSucursal> findProdSucById(Integer productId, Integer sucursalId)throws BusinessException;	
	List<ProductSucursal> getProdSucByStock(double minStock)throws BusinessException;
}
