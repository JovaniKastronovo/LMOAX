package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.taxes.ProductTaxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.ProductTaxesDao;
import com.lomejordeoax.service.ProductTaxeService;

@Service("productTaxeService")
public class ProductTaxeServiceImp implements ProductTaxeService{
	
	private static Logger logger = Logger.getLogger(ProductTaxeServiceImp.class);
	
	@Autowired
	private ProductTaxesDao productTaxesDao;

	@Transactional
	@Override
	public void saveProdTax(ProductTaxes prodTaxes) throws BusinessException {
		try {
			productTaxesDao.save(prodTaxes);
		} catch (DataException e) {
			logger.error("Error saving productTaxes="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}		
	}

	@Transactional
	@Override
	public void updProdTax(ProductTaxes prodTaxes) throws BusinessException {
		try {
			productTaxesDao.update(prodTaxes);
		} catch (Exception e) {
			logger.error("Error updaing productTaxes="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}		
	}

	@Override
	public boolean deleteProdTax(Integer prodTaxId) throws BusinessException {
		ProductTaxes prodtaxe= new ProductTaxes();
		prodtaxe.setProduct_taxe_id(prodTaxId);
		try {
			productTaxesDao.delete(prodtaxe);
			return true;
		} catch (DataException e) {
			logger.error("deleteProdTax()-The remove process failed",e);
			throw new BusinessException("Error deleting productTaxes with id ="+prodTaxId,e);
		}
	}

	@Override
	public List<ProductTaxes> findTaxesByProdId(String productId)
			throws BusinessException {
		try {
			return productTaxesDao.findTaxesByProdId(productId);
		} catch (DataException e) {
			throw new BusinessException("Error find taxes by product id",e);
		}
	}


}
