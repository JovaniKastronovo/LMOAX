package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface TaxDao extends HGenericDao<Taxes, Integer> {
	List<Taxes> getTaxesByCompany(Integer companyId)throws DataException;
}
