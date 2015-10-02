package org.lomejordeoax.model.address;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ct_phone_type")
public class PhoneType implements Serializable {

	private static final long serialVersionUID = -5375038991100456599L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer phone_type_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Integer company_id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getPhone_type_id() {
		return phone_type_id;
	}
	public void setPhone_type_id(Integer phone_type_id) {
		this.phone_type_id = phone_type_id;
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
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getModification_date() {
		return modification_date;
	}
	public void setModification_date(Date modification_date) {
		this.modification_date = modification_date;
	}
	
	@Override
	public String toString() {
		return "PhoneType [phone_type_id=" + phone_type_id + ", name=" + name
				+ ", description=" + description + ", company_id=" + company_id
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + "]";
	}	
	
}
