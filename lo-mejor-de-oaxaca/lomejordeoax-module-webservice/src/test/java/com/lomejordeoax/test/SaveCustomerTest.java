package com.lomejordeoax.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lomejordeoax.model.address.Address;
import org.lomejordeoax.model.address.AddressType;
import org.lomejordeoax.model.address.Phone;
import org.lomejordeoax.model.address.PhoneType;
import org.lomejordeoax.model.customer.Customer;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lomejordeoax.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class SaveCustomerTest {
	
	private static final Integer PHONE_TYPE_ID = 1;
	private static final Integer STATUS_ID = 1;	
	private static final Integer EMPLOYEE_ID = 1;
	private static final Integer COMPANY_ID = 1;
	private static final Integer ADDRESS_TYPE_ID = 1;
	private static final Integer NEIGHBORHOOD_ID = 1;
	
	@Autowired
	private CustomerService customerService;
	
	private Customer customer;
	
	@Before
	public void initData(){
		customer = new Customer();
	}
	
	@Test
	public void saveCustomer() throws BusinessException{
		prepateCustomerObj();
		customerService.saveCustomer(customer);		
		Assert.assertNotNull(customer);		
		Assert.assertNotNull(customer.getCustomer_id());
	}
	
	private void prepateCustomerObj(){
		customer.setFirst_name("Carlos");
		customer.setMiddle_name("Daniel");
		customer.setLast_name("Ortiz");
		customer.setEmail("carlito.ortiz@gmail.com");
		customer.setBirth_date(new Date());
		customer.setSex(new Character('H'));
		customer.setAgent("Noel Jose Perez");
		customer.setRfc("OIFI05CF54564");
		customer.setCurp("CURP5662T3232");
		customer.setCredit_limit(5000.00);
		customer.setCredit_days(20);
		customer.setEmployee_id(EMPLOYEE_ID);
		customer.setStatus_id(STATUS_ID);
		customer.setCompany_id(COMPANY_ID);
		customer.setCreated_date(new Date());
		customer.setModification_date(new Date());
		
		List<Address> addressList = optainAddress();
		List<Phone> phoneList = optainPhones();
		
		customer.setAddress(addressList);
		customer.setPhones(phoneList);		
	}
	
	private List<Address> optainAddress(){
		Address addressOne = new Address();
		AddressType addresTypeOne = new AddressType();
		addresTypeOne.setAddress_type_id(ADDRESS_TYPE_ID);
		addressOne.setAddressType(addresTypeOne);
		addressOne.setStreet("Av Stret solero");
		addressOne.setExterior_number("56");
		addressOne.setCreated_date(new Date());
		addressOne.setModification_date(new Date());
		addressOne.setStatus_id(STATUS_ID);
		addressOne.setNeighborhood_id(NEIGHBORHOOD_ID);
		addressOne.setCompany_id(COMPANY_ID);
		
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(addressOne);
		return addressList;		
	}
	
	private List<Phone> optainPhones(){		
		Phone phoneOne = new Phone();
		PhoneType phoneType = new PhoneType();
		phoneType.setPhone_type_id(PHONE_TYPE_ID);
		phoneOne.setNumber("552963684");
		phoneOne.setExtension("72563");
		phoneOne.setMobile(false);
		phoneOne.setPhoneType(phoneType);
		phoneOne.setStatus_id(STATUS_ID);
		phoneOne.setCompany_id(COMPANY_ID);
		phoneOne.setCreated_date(new Date());
		phoneOne.setModification_date(new Date());
		
		List<Phone> phoneList = new ArrayList<Phone>();
		phoneList.add(phoneOne);
		return phoneList;
	}
	
}
