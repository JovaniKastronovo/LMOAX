package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.CategoryDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("categoryDao")
public class CategoryDaoImp extends HGenericDaoImp<Category, Integer> implements CategoryDao {
	
	private static final String CATEGORY_BY_COMPANY_HQL = "from Category cat where cat.company_id = ?";
	
	@Override
	public List<Category> getCategoryByCompany(Integer companyId) throws DataException {
		List<?> result = getHibernateTemplate().find(CATEGORY_BY_COMPANY_HQL, companyId);
		return (List<Category>) result;
	}
	

}
