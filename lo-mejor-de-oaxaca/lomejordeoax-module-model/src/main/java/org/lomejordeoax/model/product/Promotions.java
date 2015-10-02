package org.lomejordeoax.model.product;

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
@Table(name = "ta_promotions")
public class Promotions implements Serializable {

	private static final long serialVersionUID = -1498598384070859726L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer promotion_id;
	@Column
	private String description;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	@Column
	private String comment;
	@Column
	private Integer status_id;
	@Column
	private Integer employee_id;
	
	public Integer getPromotion_id() {
		return promotion_id;
	}
	public void setPromotion_id(Integer promotion_id) {
		this.promotion_id = promotion_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	@Override
	public String toString() {
		return "Promotions [promotion_id=" + promotion_id + ", description="
				+ description + ", start_date=" + start_date + ", end_date="
				+ end_date + ", created_date=" + created_date
				+ ", modification_date=" + modification_date + ", comment="
				+ comment + ", status_id=" + status_id + ", employee_id="
				+ employee_id + "]";
	}

}
