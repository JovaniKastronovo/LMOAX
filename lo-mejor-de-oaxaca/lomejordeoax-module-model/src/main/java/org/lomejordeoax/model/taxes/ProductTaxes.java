package org.lomejordeoax.model.taxes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ta_product_taxes")
public class ProductTaxes implements Serializable {

	private static final long serialVersionUID = -468636919027027301L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_taxe_id;
	@Column
	private String product_id;	
	@ManyToOne
	@JoinColumn(name="tax_id")
	private Taxes taxes;	
	@Column
	private int orderr;
	@Column
	private Integer status_id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public Taxes getTaxes() {
		return taxes;
	}
	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}	
	
	public int getOrderr() {
		return orderr;
	}
	public void setOrderr(int orderr) {
		this.orderr = orderr;
	}
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
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
	public Integer getProduct_taxe_id() {
		return product_taxe_id;
	}
	public void setProduct_taxe_id(Integer product_taxe_id) {
		this.product_taxe_id = product_taxe_id;
	}
	
	@Override
	public String toString() {
		return "ProductTaxes [product_taxe_id=" + product_taxe_id
				+ ", product_id=" + product_id + ", taxes=" + taxes
				+ ", order=" + orderr + ", status_id=" + status_id
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + "]";
	}	
	
}
