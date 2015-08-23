package com.lomejordeoax.service;

import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface DepartamentService {
	void saveNewDepartament(Departament newDepto)throws BusinessException;
	void updateDepartament(Departament updDepto)throws BusinessException;
	Departament findDeptoById(int deptoId)throws BusinessException;
	boolean deleteDepto(int deptoId)throws BusinessException;
}
