package com.lomejordeoax.bll;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.model.product.Product;
import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.bll.ProductManager;
import com.lomejordeoax.service.CategoryService;
import com.lomejordeoax.service.DepartamentService;
import com.lomejordeoax.service.ProductService;
import com.lomejordeoax.service.ProductSucursalService;
import com.lomejordeoax.service.imp.ProductServiceImp;

@Service("productManager")
public class ProductManager{
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductSucursalService productSucService;	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private DepartamentService deptoService;
	
	public int getNextProdutId(Integer companyId)throws BusinessException{
		return productService.getNextProductId(companyId);		
	}
	
	public void saveProductSuc(ProductSucursal newProductSuc)throws BusinessException{
		if(newProductSuc!=null && 
				newProductSuc.getProduct()!=null &&
				newProductSuc.getEmployee_id()!=null && 
				newProductSuc.getSucursal_id()!=null ){			
			String prodKey = newProductSuc.getProduct().getProduct_key();
			if(prodKey!=null){
				logger.info("The product key is not null- current id = "+prodKey);
				//The productId already exist in product table.
				Product product = productService.findProductByKey(prodKey, 1);
				if(product!=null && product.getProduct_id()!=null){
					List<ProductSucursal> productSucList =
							productSucService.findProdSucById(product.getProduct_id(), newProductSuc.getSucursal_id());
					if(productSucList!=null && productSucList.size()>0)
						throw  new BusinessException("El producto "+product.getProduct_key()+" ya existe en esta sucursal");
					else
						//Save this product into product sucursal.
						newProductSuc.setProduct(product);	
				}
				//Save new product in this sucursal
				productSucService.saveProdSuc(newProductSuc);				
			}else
				throw  new BusinessException("Se require el id del producto");
		}else{
			logger.error("The new product is null");
			throw new BusinessException("Los datos proporcionados no son validos!");
		}
	}
	
	@Transactional
	public String generateProductId(int companyId, int deptoId, int categoryId)throws BusinessException{
		logger.info("Generatting product string id");
		int nextProdId =getNextProdutId(companyId);
		Departament deptoSelected= deptoService.findDeptoById(deptoId);
		Category catSelected = categoryService.findCatById(categoryId);
		if(deptoSelected!=null && catSelected !=null){
			StringBuilder fullId = new StringBuilder(deptoSelected.getName().substring(0, 3));
			fullId.append(catSelected.getDescription().substring(0, 3));
			fullId.append(nextProdId);
			return fullId.toString().toUpperCase();
		}else
			throw new BusinessException("Departament or category is null");
	}
	
	public List<Category> getCategoryByCompany(Integer companyId)throws BusinessException{
		return categoryService.getCategoryByCompany(companyId);
	}
	
	public List<Departament> getDeptoByCompany(Integer companyId)throws BusinessException{
		return deptoService.getDeptoByCompany(companyId);
	}
}
