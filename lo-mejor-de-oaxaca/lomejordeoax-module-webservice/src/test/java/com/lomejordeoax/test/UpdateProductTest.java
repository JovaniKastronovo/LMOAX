package com.lomejordeoax.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.ProductSucursalService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class UpdateProductTest {

	private static String PRODUCT_ID = "ABALAC8";
	private static String UPD_DESCRIPTION = "Update product name";
	private static Integer SUCURSAL_ID = 1;
	
	@Autowired
	private ProductSucursalService productSucService;
	
	@Test
	public void updateNameOfProduct() throws BusinessException{	
		ProductSucursal productSucursal =  findProductSuc(SUCURSAL_ID);
		productSucursal.getProduct().setName(UPD_DESCRIPTION);
		productSucursal.setPrice(6666);
		productSucService.updateProdSuc(productSucursal);
	}
	
	private ProductSucursal findProductSuc(Integer sucursalId) throws BusinessException{
		List<ProductSucursal> prodSucList = productSucService.findProdSucById(PRODUCT_ID, sucursalId);
		Assert.assertNotNull("Product not should be null", prodSucList);
		Assert.assertTrue("Product not should be Higher than 1", prodSucList.size()==1);
		return prodSucList.get(0);
	}
}
