package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.ProductDao;
import com.lomejordeoax.service.ProductService;

@Service("productService")
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);

	@Override
	public int getNextProductId()throws BusinessException{
		int nextId;
		try {
			nextId = productDao.getNextProductId();
			logger.info("NEXT PRODUCT ID="+nextId);
			return nextId;
		} catch (DataException e) {
			logger.error("Error getting nextProductId="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}		
	}

	@Transactional
	@Override
	public void saveProduct(Product newProduct)throws BusinessException{
		try {
			productDao.save(newProduct);
		} catch (DataException e) {
			logger.error("Error saving product="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void updateProduct(Product updProduct)throws BusinessException{
		try {
			productDao.update(updProduct);
		} catch (DataException e) {
			logger.error("Error saving product="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Product findProductById(String productId)throws BusinessException{
		try {
			Product product= productDao.find(productId);
			return product;
		} catch (Exception e) {
			logger.error("Product "+productId+" not found",e);
			throw new BusinessException("Product no found",e);
		}
	}

	@Override
	public boolean deleteProduct(String productId)throws BusinessException{
		Product product = new Product();
		product.setProduct_id(productId);
		try {
			productDao.delete(product);
			return true;
		} catch (DataException e) {
			logger.error("deleteProduct()-The remove process failed",e);
			throw new BusinessException("Error deleting product with id ="+productId,e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public List<Product> findAllProduct() throws BusinessException {
		try {
			List<Product> products= productDao.findAll();
			return products;
		} catch (DataException e) {
			throw new BusinessException("The findAllProduct failed",e);
		}
	}
}
