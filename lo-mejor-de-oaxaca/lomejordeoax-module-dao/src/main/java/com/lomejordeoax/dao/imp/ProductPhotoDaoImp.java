package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.product.ProductPhotos;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ProductPhotoDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("productPhotoDao")
public class ProductPhotoDaoImp extends HGenericDaoImp<ProductPhotos, Integer> implements
		ProductPhotoDao {
	
	private static final String PHOTOS_BY_PRODUCT_ID_HQL = "from ProductPhotos p where p.product_id=?";

	@Override
	public List<ProductPhotos> getPhotosByProductId(Integer productId) throws DataException {
		List<?> photos = getHibernateTemplate().find(PHOTOS_BY_PRODUCT_ID_HQL, productId);
		return (List<ProductPhotos>) photos;
	}

}
