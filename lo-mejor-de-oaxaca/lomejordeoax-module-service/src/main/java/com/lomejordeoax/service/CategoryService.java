package com.lomejordeoax.service;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface CategoryService {
	void saveNewCategory(Category newCategory)throws BusinessException;
	void updateCategory(Category updCategory)throws BusinessException;
	Category findCatById(int catId)throws BusinessException;
	boolean deleteCategory(int categoryId)throws BusinessException;
}
