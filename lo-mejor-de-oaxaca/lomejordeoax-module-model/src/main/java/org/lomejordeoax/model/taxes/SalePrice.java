package org.lomejordeoax.model.taxes;

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
@Table(name = "ta_sale_price")
public class SalePrice implements Serializable {

	private static final long serialVersionUID = 2243945989674321415L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sale_price_id;
	@Column
	private String product_id;
	@Column
	private String name;
	@Column
	private double net_selling_price;
	@Column
	private int wholesale;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getSale_price_id() {
		return sale_price_id;
	}
	public void setSale_price_id(Integer sale_price_id) {
		this.sale_price_id = sale_price_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNet_selling_price() {
		return net_selling_price;
	}
	public void setNet_selling_price(double net_selling_price) {
		this.net_selling_price = net_selling_price;
	}
	public int getWholesale() {
		return wholesale;
	}
	public void setWholesale(int wholesale) {
		this.wholesale = wholesale;
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
		return "SalePrice [sale_price_id=" + sale_price_id + ", product_id="
				+ product_id + ", name=" + name + ", net_selling_price="
				+ net_selling_price + ", wholesale=" + wholesale
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + "]";
	}	

}
