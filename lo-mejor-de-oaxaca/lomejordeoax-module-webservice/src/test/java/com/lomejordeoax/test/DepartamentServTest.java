package com.lomejordeoax.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.DepartamentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class DepartamentServTest {
	
	@Autowired
	private DepartamentService deptoService;
	private Departament departament;
	
	@Before
	public void initData(){
		departament = new Departament();
	}
	
	@Test
	public void saveNewDepartament() throws BusinessException{
		departament.setName("Abarrotes");
		departament.setDescription("Abarrotes");
		deptoService.saveNewDepartament(departament);
		Assert.assertNotNull(departament);
		Assert.assertTrue(departament.getDepartament_id()!=0);
	}
	@Test
	public void updateDepartament(){
		
	}

	public void setDeptoService(DepartamentService deptoService) {
		this.deptoService = deptoService;
	}	
	
}
