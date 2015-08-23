package com.lomejordeoax.rest.controller;

import java.util.List;

import org.lomejordeoax.model.product.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lomejordeoax.bll.ProductManager;

@RestController
@RequestMapping("/service/products")
public class InventoryController {
	
	
    //private ProductManager productManager;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Product getProduct(@PathVariable int id) {

		return null;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getAllProducts() {
		//List<Product> products = productManager.getProducts();
		return null;
	}

	public void setProductManager(ProductManager productManager) {
		//this.productManager = productManager;
	}	
	
}
