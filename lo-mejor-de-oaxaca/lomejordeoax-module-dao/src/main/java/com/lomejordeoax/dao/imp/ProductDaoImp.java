package com.lomejordeoax.dao.imp;

import org.lomejordeoax.model.product.Product;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;


@Repository("productDao")
public class ProductDaoImp extends HGenericDaoImp<Product, String>{

}
