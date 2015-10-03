package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class EmployeePhone implements Serializable {

	private static final long serialVersionUID = -1065116355322642744L;
	
	private Integer employee_id;
	private Integer phone_id;
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(Integer phone_id) {
		this.phone_id = phone_id;
	}
	
	@Override
	public String toString() {
		return "EmployeePhone [employee_id=" + employee_id + ", phone_id="
				+ phone_id + "]";
	}	
	
}
