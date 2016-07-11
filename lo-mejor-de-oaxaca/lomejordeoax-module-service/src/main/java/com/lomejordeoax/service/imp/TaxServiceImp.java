package com.lomejordeoax.service.imp;

import java.util.List;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomejordeoax.dao.TaxDao;
import com.lomejordeoax.service.TaxService;

@Service("taxService")
public class TaxServiceImp implements TaxService {

	private static Logger logger = Logger.getLogger(TaxServiceImp.class);
	
	@Autowired
	private TaxDao taxDao;
	
	@Override
	public List<Taxes> getTaxesByCompany(Integer companyId) throws BusinessException {
		try {
			return taxDao.getTaxesByCompany(companyId);
		} catch (DataException e) {
			logger.error("Not found taxes for this company"+companyId,e);
			throw new BusinessException("Not found taxes for this company "+companyId, e);
		}
	}
}
