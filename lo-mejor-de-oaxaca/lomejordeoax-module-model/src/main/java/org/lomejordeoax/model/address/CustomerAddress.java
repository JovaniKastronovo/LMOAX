package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class CustomerAddress implements Serializable {

	private static final long serialVersionUID = 8261916099328216477L;
	
	private Integer customer_id;
	private Integer address_id;
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
	@Override
	public String toString() {
		return "CustomerAddress [customer_id=" + customer_id + ", address_id="
				+ address_id + "]";
	}

}
