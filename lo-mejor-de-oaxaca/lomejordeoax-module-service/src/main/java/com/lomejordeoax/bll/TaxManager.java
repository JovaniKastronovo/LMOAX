package com.lomejordeoax.bll;

import java.util.List;

import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomejordeoax.service.ProductTaxeService;
import com.lomejordeoax.service.TaxService;

@Service("taxManager")
public class TaxManager {
	
	@Autowired
	private TaxService taxService;
	@Autowired
	private ProductTaxeService productTaxeService;
	
	public List<Taxes> getTaxesByCompany(Integer companyId)throws BusinessException{
		return taxService.getTaxesByCompany(companyId);
	}
	
	public List<ProductTaxes> findTaxByProductId(Integer productId) throws BusinessException{
		return productTaxeService.findTaxesByProdId(productId);
	}
		
	public void addTax(ProductTaxes productTaxes) throws BusinessException{
		productTaxeService.saveProdTax(productTaxes);
	}

}
