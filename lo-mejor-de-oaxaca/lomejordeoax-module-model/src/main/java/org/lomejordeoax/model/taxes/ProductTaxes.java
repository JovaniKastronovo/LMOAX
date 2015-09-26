package org.lomejordeoax.model.taxes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ta_product_taxes")
public class ProductTaxes implements Serializable {

	private static final long serialVersionUID = -468636919027027301L;
	@Column
	private String product_id;	
	@ManyToOne
	@JoinColumn(name="tax_id")
	private Taxes taxes;
	@Column
	private int order;
	@Column
	private Integer status_id;
	
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
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	
	@Override
	public String toString() {
		return "ProductTaxes [product_id=" + product_id + ", taxes=" + taxes
				+ ", order=" + order + ", status_id=" + status_id + "]";
	}
	
}
