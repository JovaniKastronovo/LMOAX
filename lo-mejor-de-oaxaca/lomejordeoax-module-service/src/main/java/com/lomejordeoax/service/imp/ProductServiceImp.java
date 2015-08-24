package com.lomejordeoax.service.imp;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public void saveProduct(Product newProduct)throws BusinessException{
	}

	@Override
	public void updateProduct(Product updProduct)throws BusinessException{
		
	}

	@Override
	public Product findProductById(String productId)throws BusinessException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(String productId)throws BusinessException{
		// TODO Auto-generated method stub
		return false;
	}
}
