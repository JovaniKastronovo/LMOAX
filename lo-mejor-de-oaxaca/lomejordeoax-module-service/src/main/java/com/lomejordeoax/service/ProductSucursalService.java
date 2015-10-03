package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface ProductSucursalService {
	void saveProdSuc(ProductSucursal newProdSuc)throws BusinessException;
	void updateProdSuc(ProductSucursal updProdSuc)throws BusinessException;
	List<ProductSucursal> getProdBySucursal(Integer sucursalId)throws BusinessException;
	List<ProductSucursal> findProdSucById(String productId, Integer sucursalId)throws BusinessException;	
	List<ProductSucursal> getProdSucByStock(double minStock)throws BusinessException;
}
