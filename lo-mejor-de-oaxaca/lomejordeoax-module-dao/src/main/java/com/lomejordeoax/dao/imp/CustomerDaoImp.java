package com.lomejordeoax.dao.imp;

import org.lomejordeoax.model.customer.Customer;
import org.springframework.stereotype.Repository;

import com.lomejordeoax.dao.CustomerDao;
import com.lomejordeoax.dao.generic.imp.HGenericDaoImp;

@Repository("customerDao")
public class CustomerDaoImp extends HGenericDaoImp<Customer, Integer> implements
		CustomerDao {

}
