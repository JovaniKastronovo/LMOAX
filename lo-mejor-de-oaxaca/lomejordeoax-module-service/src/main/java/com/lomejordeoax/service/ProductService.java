package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface ProductService {
	int getNextProductId(Integer companyId)throws BusinessException;
	void saveProduct(Product newProduct)throws BusinessException;
	void updateProduct(Product updProduct)throws BusinessException;
	Product findProductById(String productId)throws BusinessException;
	List<Product> findAllProduct()throws BusinessException;
	boolean deleteProduct(String productId)throws BusinessException;
}
