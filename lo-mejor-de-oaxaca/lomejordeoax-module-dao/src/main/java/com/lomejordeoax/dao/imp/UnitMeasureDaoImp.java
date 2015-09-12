package com.lomejordeoax.dao.imp;

import org.lomejordeoax.model.product.UnitMeasure;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.UnitMeasureDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;


@Repository("unitMeasureDao")
public class UnitMeasureDaoImp extends HGenericDaoImp<UnitMeasure, Integer> implements UnitMeasureDao{

}
