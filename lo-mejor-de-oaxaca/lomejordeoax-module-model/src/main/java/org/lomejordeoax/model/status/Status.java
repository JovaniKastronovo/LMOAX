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
@Table(name = "ct_status")
public class Status implements Serializable {

	private static final long serialVersionUID = -374653760766887580L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer status_id;
	@Column
	private Integer status_category_id;
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
	
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	public Integer getStatus_category_id() {
		return status_category_id;
	}
	public void setStatus_category_id(Integer status_category_id) {
		this.status_category_id = status_category_id;
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
		return "Status [status_id=" + status_id + ", status_category_id="
				+ status_category_id + ", name=" + name + ", description="
				+ description + ", created_date=" + created_date
				+ ", modification_date=" + modification_date + "]";
	}		

}
