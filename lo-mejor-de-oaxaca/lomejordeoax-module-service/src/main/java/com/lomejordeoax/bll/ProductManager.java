package com.lomejordeoax.bll;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;

import com.lomejordeoax.bll.ProductManager;
import com.lomejordeoax.service.CategoryService;
import com.lomejordeoax.service.DepartamentService;
import com.lomejordeoax.service.ProductService;
import com.lomejordeoax.service.imp.ProductServiceImp;

public class ProductManager{
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private DepartamentService deptoService;
	
	public int getNextProdutId(Integer companyId)throws BusinessException{
		return productService.getNextProductId(companyId);		
	}
	
	public void saveNewProduct(Product newProduct,boolean addId,Integer companyId)throws BusinessException{
		if(newProduct!=null){
			if(newProduct.getProduct_id()!=null && !addId){
				logger.info("The product id is not null- current id genereted "+newProduct.getProduct_id());
				productService.saveProduct(newProduct);
			}else if(newProduct.getProduct_id()!=null && addId){
				logger.info("The product id is not null - add next product id to id captured");
				int nextId=getNextProdutId(companyId);
				newProduct.setProduct_id(newProduct.getProduct_id()+nextId);
				productService.saveProduct(newProduct);
			}else{
				logger.info("The product id is null - generate next full product id");
				int nextId=getNextProdutId(companyId);
				String fullNextId=generateProductId(nextId,0,0);
				logger.info("Full product id genetated id "+fullNextId);
				newProduct.setProduct_id(fullNextId);
			}
		}else{
			logger.error("The new product is null");
		}
	}
	
	private String generateProductId(int nextId,int deptoId,int categoryId)throws BusinessException{
		logger.info("Generatting product string id");
		Departament deptoSelected= deptoService.findDeptoById(deptoId);
		Category catSelected = categoryService.findCatById(categoryId);
		if(deptoSelected!=null && catSelected !=null){
			StringBuilder fullId = new StringBuilder(deptoSelected.getName().substring(0, 3));
			fullId.append(catSelected.getDescription().substring(0, 3));
			fullId.append(nextId);
			return fullId.toString();
		}else
			throw new BusinessException("Departament or category is null");
	}

}
