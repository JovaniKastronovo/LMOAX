package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface CategoryService {
	void saveNewCategory(Category newCategory)throws BusinessException;
	void updateCategory(Category updCategory)throws BusinessException;
	Category findCatById(Integer catId)throws BusinessException;
	List<Category> findAllCat()throws BusinessException;
	boolean deleteCategory(Integer categoryId)throws BusinessException;
}
