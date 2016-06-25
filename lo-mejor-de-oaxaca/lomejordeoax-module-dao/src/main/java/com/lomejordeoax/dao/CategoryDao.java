package com.lomejordeoax.dao;

import java.util.List;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.DataException;

import com.lomejordeoax.dao.generic.HGenericDao;

public interface CategoryDao extends HGenericDao<Category, Integer> {
	List<Category> getCategoryByCompany(Integer companyId) throws DataException;
}
