package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lomejordeoax.dao.DepartamentDao;
import com.lomejordeoax.service.DepartamentService;

@Service("deptoService")
public class DepartamentServiceImp implements DepartamentService {
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);
	
	@Autowired
	private DepartamentDao deptoDao;	

	@Transactional
	@Override
	public void saveNewDepartament(Departament newDepto)throws BusinessException{
		try {
			deptoDao.save(newDepto);
		} catch (DataException e) {
			logger.error("Error saving departament",e);
			throw new BusinessException("Error saving departament",e);
		}
	}

	@Transactional
	@Override
	public void updateDepartament(Departament updDepto)throws BusinessException{
		try {
			deptoDao.update(updDepto);
		} catch (DataException e) {
			logger.error("Error updating departament",e);
			throw new BusinessException("Error updating departament",e);
		}

	}

	@Transactional(readOnly = true)
	@Override
	public Departament findDeptoById(Integer deptoId) throws BusinessException {
		try {
			Departament dep= deptoDao.find(deptoId);
			return dep;
		} catch (DataException e) {
			logger.error("Departament "+deptoId+" not found",e);
			throw new BusinessException("Departament no found",e);
		}		
	}

	@Transactional
	@Override
	public boolean deleteDepto(Integer deptoId) throws BusinessException {
		Departament removeDepto = new Departament();
		removeDepto.setDepartament_id(deptoId);
		try {
			deptoDao.delete(removeDepto);
			return true;
		} catch (DataException e) {
			logger.error("The remove process failed",e);
			throw new BusinessException("Error deleting departament",e);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departament> findAllDepto() throws BusinessException {
		try {
			List<Departament> deptos= deptoDao.findAll();
			return deptos;
		} catch (DataException e) {
			throw new BusinessException("The findAllDepto failed",e);
		}
	}

	@Override
	public List<Departament> getDeptoByCompany(Integer companyId)
			throws BusinessException {
		try {
			return deptoDao.getDeptoByCompany(companyId);
		} catch (DataException e) {
			throw new BusinessException("The getDeptoByCompany failed",e);
		}
	}
}
