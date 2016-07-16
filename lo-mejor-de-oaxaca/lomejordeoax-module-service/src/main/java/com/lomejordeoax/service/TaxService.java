package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface TaxService {
	List<Taxes> getTaxesByCompany(Integer companyId)throws BusinessException;
}
