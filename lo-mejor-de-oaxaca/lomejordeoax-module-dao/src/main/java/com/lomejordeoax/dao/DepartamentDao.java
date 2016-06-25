package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface DepartamentDao extends HGenericDao<Departament, Integer> {
	List<Departament> getDeptoByCompany(Integer companyId) throws DataException;	
}
