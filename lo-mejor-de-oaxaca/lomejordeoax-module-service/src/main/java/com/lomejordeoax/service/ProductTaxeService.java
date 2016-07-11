package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface ProductTaxeService{
	void saveProdTax(ProductTaxes prodTaxes)throws BusinessException;
	void updProdTax(ProductTaxes prodTaxes)throws BusinessException;
	boolean deleteProdTax(Integer prodTaxId)throws BusinessException;
	List<ProductTaxes>findTaxesByProdId(Integer productId)throws BusinessException;
}
