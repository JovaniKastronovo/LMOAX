package org.lomejordeoax.model.sales;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ct_type_of_currency")
public class TypeOfCurrency implements Serializable {

	private static final long serialVersionUID = -4342540045467587242L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer type_of_currency_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Double default_exchange_rate;
	@Column
	private Integer company_id;
	
	public Integer getType_of_currency_id() {
		return type_of_currency_id;
	}
	public void setType_of_currency_id(Integer type_of_currency_id) {
		this.type_of_currency_id = type_of_currency_id;
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
	public Double getDefault_exchange_rate() {
		return default_exchange_rate;
	}
	public void setDefault_exchange_rate(Double default_exchange_rate) {
		this.default_exchange_rate = default_exchange_rate;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		return "TypeOfCurrency [type_of_currency_id=" + type_of_currency_id
				+ ", name=" + name + ", description=" + description
				+ ", default_exchange_rate=" + default_exchange_rate
				+ ", company_id=" + company_id + "]";
	}	
	
}
