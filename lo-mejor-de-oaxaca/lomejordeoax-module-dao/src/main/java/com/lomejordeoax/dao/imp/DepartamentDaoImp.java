package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.DepartamentDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("deptoDao")
public class DepartamentDaoImp extends HGenericDaoImp<Departament, Integer> implements DepartamentDao{

	private static final String DEPTO_BY_COMPANY_HQL = "from Departament d where d.company_id = ?";
		
	@Override
	public List<Departament> getDeptoByCompany(Integer companyId)
			throws DataException {
		List<?> result = getHibernateTemplate().find(DEPTO_BY_COMPANY_HQL, companyId);
		return (List<Departament>) result;
	}
	

}
