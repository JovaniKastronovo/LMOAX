package com.lomejordeoax.service;

import org.lomejordeoax.model.customer.Customer;
import org.lomejordeoax.utilities.exceptions.BusinessException;

public interface CustomerService {
	void saveCustomer(Customer newCustomer)throws BusinessException;
	void updateCustomer(Customer customer)throws BusinessException;
}
