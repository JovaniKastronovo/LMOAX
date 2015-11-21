package com.lomejordeoax.service.imp;

import org.apache.log4j.Logger;
import org.lomejordeoax.model.customer.Customer;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.lomejordeoax.utilities.exceptions.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lomejordeoax.dao.CustomerDao;
import com.lomejordeoax.service.CustomerService;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {
	
	private static Logger logger = Logger.getLogger(CustomerServiceImp.class);
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public void saveCustomer(Customer newCustomer) throws BusinessException {
		try {
			customerDao.save(newCustomer);
		} catch (DataException e) {
			logger.error("Error saving customer="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}

	}

	@Override
	public void updateCustomer(Customer customer) throws BusinessException {
		try {
			customerDao.update(customer);
		} catch (DataException e) {
			logger.error("Error updating the customer="+e.getMessage(),e);
			throw new BusinessException(e.getMessage());
		}
	}

}
