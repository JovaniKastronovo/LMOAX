package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ProductSucursalDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("productSucDao")
public class ProductSucursalDaoImp extends HGenericDaoImp<ProductSucursal, Integer>
		implements ProductSucursalDao {
	
	private static final String PRODUCTS_BY_SUCURSAL_ID_HQL = "from ProductSucursal ps where ps.sucursal_id = ?";
	private static final String PRODUCT_SUCURSAL_BY_ID = "from ProductSucursal ps where ps.product.product_id = ? and ps.sucursal_id=?";
	private static final String PRODUCT_SUC_CURRENT_STOCK = "from ProductSucursal ps where ps.stock = ?";
	
	@Override
	public List<ProductSucursal> getProdBySucursal(Integer sucursalId)
			throws BusinessException {
		List<?> result= getHibernateTemplate().find(PRODUCTS_BY_SUCURSAL_ID_HQL, sucursalId);
		return ((List<ProductSucursal>) result);
	}

	@Override
	public  List<ProductSucursal> findProdSucById(String productId, Integer sucursalId)
			throws BusinessException {
		List<?> result = getHibernateTemplate().find(PRODUCT_SUCURSAL_BY_ID, productId,sucursalId);
		return ((List<ProductSucursal>) result);
	}

	@Override
	public List<ProductSucursal> getProdSucByStock(double stock)
			throws BusinessException {
		List<?> result = getHibernateTemplate().find(PRODUCT_SUC_CURRENT_STOCK, stock);
		return ((List<ProductSucursal>) result);
	}	
	

}
