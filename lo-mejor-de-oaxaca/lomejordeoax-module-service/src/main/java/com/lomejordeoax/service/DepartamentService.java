package com.lomejordeoax.service;

import java.util.List;

import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface DepartamentService {
	void saveNewDepartament(Departament newDepto)throws BusinessException;
	void updateDepartament(Departament updDepto)throws BusinessException;
	Departament findDeptoById(Integer deptoId)throws BusinessException;
	List<Departament> findAllDepto()throws BusinessException;
	List<Departament> getDeptoByCompany(Integer companyId)throws BusinessException;
	boolean deleteDepto(Integer deptoId)throws BusinessException;
}
