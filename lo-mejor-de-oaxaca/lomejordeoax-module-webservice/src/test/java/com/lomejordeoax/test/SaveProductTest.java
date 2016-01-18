package com.lomejordeoax.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.model.product.UnitMeasure;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.CategoryService;
import com.lomejordeoax.service.DepartamentService;
import com.lomejordeoax.service.ProductService;
import com.lomejordeoax.service.ProductSucursalService;
import com.lomejordeoax.service.UnitMeasureService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveProductTest {
	
	private static Integer CATEGORY_ID = 1;
	private static Integer UNIT_MEASURE_ID = 1;
	private static String PRODUCT_NAME = "Chocolate";
	private static String SHORT_NAME = "Chocol";
	private static int COMPANY_ID = 1;
	
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductSucursalService productSucService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private DepartamentService deptoService;
	@Autowired
	private UnitMeasureService unitMeasureService;
	
	private Product product;
	private ProductSucursal productSucursal;
	
	@Before
	public void initData(){
		product = new Product();
		productSucursal = new ProductSucursal();
	}
	
	@Test
	public void saveProduct() throws BusinessException{
		prepateProduct();
		productService.saveProduct(product);		
		Assert.assertNotNull(product);		
		Assert.assertNotNull(product.getProduct_id());
		prepateProductSucursal();
		productSucService.saveProdSuc(productSucursal);
		Assert.assertNotNull(productSucursal);		
		Assert.assertNotNull(productSucursal.getProduct());
		Assert.assertNotNull(productSucursal.getProduct().getProduct_id());
		Assert.assertNotNull(productSucursal.getSucursal_id());
		
	}
	
	private void prepateProduct() throws BusinessException{
		Category catSelected = optainCategory();
		UnitMeasure unitM = optainUnitM();
		
		String productIdGenerated = generateProductId(catSelected);
		
		Assert.assertNotNull(productIdGenerated);
		Assert.assertTrue("The next product id should be greater than six",productIdGenerated.length()>0);
		
		product.setProduct_id(productIdGenerated);
		product.setProduct_key(productIdGenerated);
		product.setName(PRODUCT_NAME);
		product.setDescription(PRODUCT_NAME);
		product.setAbbrevation(SHORT_NAME);
		product.setService(0);
		product.setFactor(1.0);
		product.setLot(0);
		product.setNet_price(0);
		product.setPrescription(0);
		product.setGranel(1);
		product.setCreated_date(new Date());
		product.setModification_date(new Date());
		product.setUnitBuy(unitM);
		product.setUnitSale(unitM);
		
		product.setCategory(catSelected);
	}
	
	private void prepateProductSucursal(){
		productSucursal.setProduct(product);
		productSucursal.setSucursal_id(1);
		productSucursal.setPrice(149.36);
		productSucursal.setStock(20);
		productSucursal.setProvider_id(1);
		productSucursal.setEmployee_id(1);
		productSucursal.setPurchase_price(125.5);
		productSucursal.setMin_stock(5);
		productSucursal.setMax_stock(5);
		productSucursal.setLocation("Vitrina");
		productSucursal.setProduct_status_id(1);
	}
	private int getNextProductId() throws BusinessException{
		int nextProductId = productService.getNextProductId(COMPANY_ID);
		Assert.assertTrue("The next product id should be greater than zero.", nextProductId>0);
		return nextProductId;
	}
	
	private String generateProductId(Category catSelected) throws BusinessException{
		int nextProductId = getNextProductId();	
		Departament depto = catSelected.getDepartament();
		String threeLetterForDepto = depto.getName().substring(0, 3);
		String threeLetterForCateg = catSelected.getDescription().substring(0, 3);
		StringBuilder fullId = new StringBuilder(threeLetterForDepto);
		fullId.append(threeLetterForCateg);
		fullId.append(nextProductId);		
		
		return fullId.toString().toUpperCase();
	}
	
	private Category optainCategory() throws BusinessException{
		Category catSelected = categoryService.findCatById(CATEGORY_ID);
		Assert.assertNotNull("The process can not continue when the category is null->",catSelected);
		return catSelected;
	}
	
	private UnitMeasure optainUnitM() throws BusinessException{
		 UnitMeasure unitM = unitMeasureService.findUnitById(UNIT_MEASURE_ID);
		 Assert.assertNotNull("Unit measure 1 not found", unitM);
		 Assert.assertNotNull(unitM.getUnit_measure_id());
		 Assert.assertTrue(unitM.getUnit_measure_id().equals(1));
		 
		 return unitM;
	}
}
