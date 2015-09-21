package org.lomejordeoax.model.sales;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "ct_method_of_payment")
public class MethodOfPayment implements Serializable {

	private static final long serialVersionUID = -1513539255839289389L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer method_payment_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Integer company_id;
	
	public Integer getMethod_payment_id() {
		return method_payment_id;
	}
	public void setMethod_payment_id(Integer method_payment_id) {
		this.method_payment_id = method_payment_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		return "MethodOfPayment [method_payment_id=" + method_payment_id
				+ ", name=" + name + ", description=" + description
				+ ", company_id=" + company_id + "]";
	}	

}
