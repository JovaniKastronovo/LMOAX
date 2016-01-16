package com.lomejordeoax.dao.imp;

import java.util.List;

import org.lomejordeoax.model.shopping.Shopping;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.ShoppingDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@SuppressWarnings("unchecked")
@Repository("shoopingDao")
public class ShoopingDaoImp extends HGenericDaoImp<Shopping, Integer> implements
		ShoppingDao {

	private static final String SHOPPING_BY_STATUS_HQL = "from Shopping s where s.shopping_status_id";
	private static final String SHOPPING_BY_SUCURSAL_HQL =  "from Shopping s where s.sucursal_id = ?";
	private static final String SHOPPING_BY_EMPLOYEE_ID = "from Shopping s where s.employee_id = ?";

	@Override
	public List<Shopping> shoppingByStatus(Integer shoppingStatusId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(SHOPPING_BY_STATUS_HQL, shoppingStatusId);
		return (List<Shopping>) result;
	}

	@Override
	public List<Shopping> shoppingBySucursal(Integer sucursalId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(SHOPPING_BY_SUCURSAL_HQL, sucursalId);
		return (List<Shopping>) result;
	}

	@Override
	public List<Shopping> shoppingByEmployeeId(Integer employeeId)
			throws DataException {
		List<?> result= getHibernateTemplate().find(SHOPPING_BY_EMPLOYEE_ID, employeeId);
		return (List<Shopping>) result;
	}

}
