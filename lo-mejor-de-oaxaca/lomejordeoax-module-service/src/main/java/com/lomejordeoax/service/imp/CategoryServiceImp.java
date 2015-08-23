package com.lomejordeoax.service.imp;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import com.lomejordeoax.service.CategoryService;

@Service("productCatService")
public class CategoryServiceImp implements CategoryService {

	@Override
	public void saveNewCategory(Category newCategory) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Category updCategory) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findCatById(int catId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCategory(int categoryId) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

	

}
