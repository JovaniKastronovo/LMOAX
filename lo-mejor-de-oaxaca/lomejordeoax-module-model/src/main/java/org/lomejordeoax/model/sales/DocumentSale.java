package org.lomejordeoax.model.sales;

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
@Table(name = "ct_document_sale")
public class DocumentSale implements Serializable {

	private static final long serialVersionUID = 2688632400487679082L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer document_sale_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String picture;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	@Column
	private Integer company_id;
	
	public Integer getDocument_sale_id() {
		return document_sale_id;
	}
	public void setDocument_sale_id(Integer document_sale_id) {
		this.document_sale_id = document_sale_id;
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
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		return "DocumentSale [document_sale_id=" + document_sale_id + ", name="
				+ name + ", description=" + description + ", created_date="
				+ created_date + ", modification_date=" + modification_date
				+ ", company_id=" + company_id + "]";
	}	
	
}
