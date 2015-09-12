package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.UnitMeasure;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.UnitMeasureDao;
import com.lomejordeoax.service.UnitMeasureService;

@Service("unitMeasureService")
public class UnitMeasureServiceImp implements UnitMeasureService {
	
	private static Logger logger = Logger.getLogger(UnitMeasureServiceImp.class);
	
	@Autowired
	private UnitMeasureDao unitMeasureDao;

	@Transactional
	@Override
	public void saveUnit(UnitMeasure newUnit) throws BusinessException {
		try {
			unitMeasureDao.save(newUnit);
		} catch (DataException e) {
			logger.error("Error saving unit measure",e);
			throw new BusinessException("Save unit measure failed",e);
		}
	}

	@Transactional
	@Override
	public void updateUnit(UnitMeasure updUnit) throws BusinessException {
		try {
			unitMeasureDao.update(updUnit);
		} catch (DataException e) {
			throw new BusinessException("Update unit measure failed",e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public UnitMeasure findUnitById(Integer unitId) throws BusinessException {
		try {
			UnitMeasure unitM=unitMeasureDao.find(unitId);
			return unitM;
		} catch (DataException e) {
			logger.error("UnitMeasure "+unitId+" not found",e);
			throw new BusinessException("UnitMeasure "+unitId+" not found",e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public List<UnitMeasure> findAllUnits() throws BusinessException {
		try {
			List<UnitMeasure> unitsM= unitMeasureDao.findAll();
			return unitsM;
		} catch (DataException e) {
			throw new BusinessException("The findAllUnits() failed",e);
		}
	}

	@Transactional
	@Override
	public boolean deleteUnit(Integer unitId) throws BusinessException {
		UnitMeasure unit = new UnitMeasure();
		unit.setUnit_measure_id(unitId);
		try {
			unitMeasureDao.delete(unit);
			return true;
		} catch (DataException e) {
			logger.error("The remove process failed in deleteUnit()",e);
			throw new BusinessException("Error deleting unit measure",e);
		}
	}

}
