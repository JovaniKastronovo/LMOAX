package com.lomejordeoax.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.UnitMeasure;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.service.UnitMeasureService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class UnitMeasureServiceTest {
	
	@Autowired
	private UnitMeasureService unitMeasureService;
	private UnitMeasure unitMeasure;
	
	@Before
	public void initData(){
		unitMeasure = new UnitMeasure();
	}
	
	@Test
	public void saveUnitMtest() throws BusinessException{
		loadNewUnit();
		unitMeasureService.saveUnit(unitMeasure);
		Assert.assertNotNull(unitMeasure);
		Assert.assertTrue(unitMeasure.getUnit_measure_id()!=null && unitMeasure.getUnit_measure_id()>0);
		updateUnit();
	}
	
	private void loadNewUnit(){
		unitMeasure.setUnit_measure("Kilogramo");
		unitMeasure.setDescription("Kilos");
		unitMeasure.setAbbreviation("Kg");
		unitMeasure.setCompany_id(1);
		unitMeasure.setCreated_date(new Date());
		unitMeasure.setModification_date(new Date());
	}
	
	@Test
	public void updateUnit() throws BusinessException{
		loadNewUnit();
		unitMeasure.setUnit_measure_id(1);
		unitMeasure.setDescription("Kimiilos");
		unitMeasureService.updateUnit(unitMeasure);
		Assert.assertNotNull(unitMeasure);
		Assert.assertNotNull(unitMeasure.getDescription());
		Assert.assertTrue(unitMeasure.getDescription().equals("Kimiilos"));
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findUnitbyId() throws BusinessException{
	   UnitMeasure unitM = unitMeasureService.findUnitById(1);
	   Assert.assertNotNull("Unit measure 1 not found", unitM);
	   Assert.assertNotNull(unitM.getUnit_measure_id());
	   Assert.assertTrue(unitM.getUnit_measure_id().equals(1));
	   System.out.println(unitM.toString());
	}
	
	@Test
	@Transactional(readOnly = true)
	public void findAllUnit() throws BusinessException{
		 List<UnitMeasure> unitMList= unitMeasureService.findAllUnits();
		 Assert.assertNotNull(unitMList);
		 Assert.assertTrue(!unitMList.isEmpty());
		 System.out.println(unitMList.toString());
	}
	
	
	@Test
	public void removeCategory() throws BusinessException{
		Assert.assertTrue(unitMeasureService.deleteUnit(4));
	}

}
