package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.taxes.Taxes;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.TaxDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("taxDao")
public class TaxDaoImp extends HGenericDaoImp<Taxes, Integer> implements TaxDao {
	
	private static final String TAXES_BY_COMPANY_HQL = "from Taxes t where t.company_id=?";
	
	@Override
	public List<Taxes> getTaxesByCompany(Integer companyId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(TAXES_BY_COMPANY_HQL, companyId);
		return ((List<Taxes>) result);
	}

}
