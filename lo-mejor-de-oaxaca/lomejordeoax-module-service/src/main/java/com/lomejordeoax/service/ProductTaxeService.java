package com.lomejordeoax.service;

import org.lomejordeoax.model.taxes.ProductTaxes;

public interface ProductTaxeService{
	void saveProdTax(ProductTaxes prodTaxes);
	void updProdTax(ProductTaxes prodTaxes);
	boolean deleteProdTax(Integer prodTaxId);
}
