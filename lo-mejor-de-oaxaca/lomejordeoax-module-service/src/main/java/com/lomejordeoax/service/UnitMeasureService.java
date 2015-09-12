package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.UnitMeasure;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface UnitMeasureService {
	void saveUnit(UnitMeasure newUnit)throws BusinessException;
	void updateUnit(UnitMeasure updUnit)throws BusinessException;
	UnitMeasure findUnitById(Integer unitId)throws BusinessException;
	List<UnitMeasure> findAllUnits()throws BusinessException;
	boolean deleteUnit(Integer unitId)throws BusinessException;
}
