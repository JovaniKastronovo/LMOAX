package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ta_employee_address")
public class EmployeeAddress implements Serializable {

	private static final long serialVersionUID = 6086769613440747907L;
	
	@Column
	private Integer employee_id;
	@Column
	private Integer address_id;
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
	@Override
	public String toString() {
		return "EmployeeAddress [employee_id=" + employee_id + ", address_id="
				+ address_id + "]";
	}	

}
