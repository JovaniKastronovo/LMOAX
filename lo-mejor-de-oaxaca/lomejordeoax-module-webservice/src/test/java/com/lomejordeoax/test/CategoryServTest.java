package com.lomejordeoax.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class CategoryServTest {
	
	@Autowired
	private CategoryService productCatService;
	private Category category;

	@Before
	public void initData(){
		category = new Category();
	}
	
	@Test
	public void addNewCat() throws BusinessException{
		createNewCatetObj();
		productCatService.saveNewCategory(category);
		Assert.assertNotNull(category);
		Assert.assertTrue(category.getCategory_id()!=null && category.getCategory_id()>0);
		updateCategoryObj();
	}
	
	private void createNewCatetObj(){
		Departament depto = new Departament();
		depto.setDepartament_id(1);
		depto.setDescription("Abarratotes");
		depto.setDescription("Abarrotes");
		category.setDepartament(depto);
		category.setName("Cereales");
		category.setDescription("Todo tipo de cereal");
		category.setPicture("ref0545.jpg");
		category.setCompany_id(1);
		category.setCreated_date(new Date());
		category.setModification_date(new Date());
	}
	
	private void updateCategoryObj() throws BusinessException{
		category.setDescription("Lacteos");
		productCatService.updateCategory(category);
		Assert.assertNotNull(category);
		Assert.assertNotNull(category.getDescription());
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findDeptobyId() throws BusinessException{
	   Category category = productCatService.findCatById(1);
	   Assert.assertNotNull("Category 1 not found", category);
	   Assert.assertNotNull(category.getCategory_id());
	   Assert.assertTrue(category.getCategory_id().equals(1));
	   System.out.println(category.toString());
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findAllDepto() throws BusinessException{
		 List<Category> categories= productCatService.findAllCat();
		 Assert.assertNotNull(categories);
		 Assert.assertTrue(!categories.isEmpty());
		 System.out.println(categories.toString());
	}
	
	@Test
	public void removeCategory() throws BusinessException{
		Assert.assertTrue(productCatService.deleteCategory(5));
	}
}
