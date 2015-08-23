package com.lomejordeoax.service.imp;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomejordeoax.dao.DepartamentDao;
import com.lomejordeoax.service.DepartamentService;

@Service("deptoService")
public class DepartamentServiceImp implements DepartamentService {
	
	private static Logger logger = Logger.getLogger(ProductServiceImp.class);
	
	@Autowired
	private DepartamentDao deptoDao;	

	@Override
	public void saveNewDepartament(Departament newDepto)throws BusinessException{
		try {
			deptoDao.save(newDepto);
		} catch (DataException e) {
			logger.error("Error saving departament",e);
			throw new BusinessException("Error saving departament",e);
		}
	}

	@Override
	public void updateDepartament(Departament updDepto)throws BusinessException{
		// TODO Auto-generated method stub

	}

	@Override
	public Departament findDeptoById(int deptoId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDepto(int deptoId) throws BusinessException {
		// TODO Auto-generated method stub
		return false;
	}

}
