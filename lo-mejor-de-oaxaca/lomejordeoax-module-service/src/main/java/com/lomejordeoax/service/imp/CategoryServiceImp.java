package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.CategoryDao;
import com.lomejordeoax.service.CategoryService;

@Service("productCatService")
public class CategoryServiceImp implements CategoryService {
	
	private static Logger logger = Logger.getLogger(CategoryServiceImp.class);
	
	@Autowired
	private CategoryDao categoryDao;

	@Transactional
	@Override
	public void saveNewCategory(Category newCategory) throws BusinessException {
		try {
			categoryDao.save(newCategory);
		} catch (DataException e) {
			logger.error("Error saving category",e);
			throw new BusinessException("Save category failed",e);
		}		
	}

	@Transactional
	@Override
	public void updateCategory(Category updCategory) throws BusinessException {
		try {
			categoryDao.update(updCategory);
		} catch (DataException e) {
			e.printStackTrace();
			throw new BusinessException("Update category failed",e);
		}		
	}

	@Transactional(readOnly = true)
	@Override
	public Category findCatById(Integer catId) throws BusinessException {
		try {
			Category cat= categoryDao.find(catId);
			return cat;
		} catch (DataException e) {
			logger.error("Category "+catId+" not found",e);
			throw new BusinessException("Error updating category",e);
		}
	}

	@Transactional
	@Override
	public boolean deleteCategory(Integer categoryId) throws BusinessException {
		Category category= new Category();
		category.setCategory_id(categoryId);
		try {
			categoryDao.delete(category);
			return true;
		} catch (DataException e) {
			logger.error("The remove process failed in deleteCategory()",e);
			throw new BusinessException("Error deleting category",e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public List<Category> findAllCat() throws BusinessException {
		try {
			List<Category> cats= categoryDao.findAll();
			return cats;
		} catch (DataException e) {
			throw new BusinessException("The findAllCat() failed",e);
		}
	}
}
