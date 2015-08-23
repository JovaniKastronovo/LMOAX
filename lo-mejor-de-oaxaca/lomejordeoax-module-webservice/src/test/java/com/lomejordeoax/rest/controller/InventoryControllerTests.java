package com.lomejordeoax.rest.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.lomejordeoax.model.product.Product;


public class InventoryControllerTests {
	
	@Test
    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        //controller.setProductManager(new ProductManager());
        List<Product> product=controller.getAllProducts();
        assertNotNull(product);
        assertTrue(product.size()>0);
    }

}
