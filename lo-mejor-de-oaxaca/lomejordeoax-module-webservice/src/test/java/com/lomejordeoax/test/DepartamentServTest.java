package com.lomejordeoax.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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
	public void testNewDeparto() throws BusinessException{	
		createNewDeptoInst();
		deptoService.saveNewDepartament(departament);
		Assert.assertNotNull(departament);
		Assert.assertTrue(departament.getDepartament_id()!=0);
		updateDepartament();
	}
	
	private void updateDepartament() throws BusinessException{
		createUpdDepto();
		deptoService.updateDepartament(departament);
		Assert.assertNotNull(departament);
		Assert.assertNotNull(departament.getDescription());
		Assert.assertNotNull(departament.getName());
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findDeptobyId() throws BusinessException{
	   Departament depto = deptoService.findDeptoById(6);
	   Assert.assertNotNull("Departament 6 not found", depto);
	   Assert.assertNotNull(depto.getDepartament_id());
	   Assert.assertTrue(depto.getDepartament_id().equals(6));
	   System.out.println(depto.toString());
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findAllDepto() throws BusinessException{
		 List<Departament> deptos= deptoService.findAllDepto();
		 Assert.assertNotNull(deptos);
		 Assert.assertTrue(!deptos.isEmpty());
		 System.out.println(deptos.toString());
	}
	
	@Test
	public void deleteDepto() throws BusinessException{
		boolean result=deptoService.deleteDepto(8);
		Assert.assertTrue(result);
	}
	
	private void createNewDeptoInst(){
		departament.setName("Abarrotes");
		departament.setDescription("Abarrotes");	
		departament.setPicture("aba.pgn");
		departament.setCompany_id(1);
		departament.setCreated_date(new Date());
		departament.setModification_date(new Date());
	}
	
	private void createUpdDepto(){
		departament.setName("Abarrotes");
		departament.setDescription("Abarrotito");	
	}

	public void setDeptoService(DepartamentService deptoService) {
		this.deptoService = deptoService;
	}	
	
}
