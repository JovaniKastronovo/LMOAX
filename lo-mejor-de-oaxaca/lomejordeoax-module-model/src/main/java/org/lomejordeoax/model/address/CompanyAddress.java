package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


public class CompanyAddress implements Serializable {
	
	private static final long serialVersionUID = 7679616651488321856L;
	
	
	private Integer company_id;
	
	private Integer address_id;
	
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
	@Override
	public String toString() {
		return "CompanyAddress [company_id=" + company_id + ", address_id="
				+ address_id + "]";
	}	

}
