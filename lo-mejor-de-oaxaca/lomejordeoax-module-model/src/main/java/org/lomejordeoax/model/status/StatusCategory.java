package org.lomejordeoax.model.status;

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
@Table(name = "ct_status_category")
public class StatusCategory implements Serializable {

	private static final long serialVersionUID = 566429664691795450L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer category_status_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getCategory_status_id() {
		return category_status_id;
	}
	public void setCategory_status_id(Integer category_status_id) {
		this.category_status_id = category_status_id;
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
		return "StatusCategory [category_status_id=" + category_status_id
				+ ", name=" + name + ", description=" + description
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + "]";
	}	

}
