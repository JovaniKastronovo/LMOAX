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
@Table(name = "ta_product_lot")
public class ProductLot implements Serializable {

	private static final long serialVersionUID = 1773630571898137910L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_lot_it;
	@Column
	private String product_id;
	@Column
	private String lot;
	@Column
	private double initial_stock;
	@Column
	private double current_stock;
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_of_manufacture;
	@Column
	@Temporal(TemporalType.DATE)
	private Date expiration_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	
	public Integer getProduct_lot_it() {
		return product_lot_it;
	}
	public void setProduct_lot_it(Integer product_lot_it) {
		this.product_lot_it = product_lot_it;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public double getInitial_stock() {
		return initial_stock;
	}
	public void setInitial_stock(double initial_stock) {
		this.initial_stock = initial_stock;
	}
	public double getCurrent_stock() {
		return current_stock;
	}
	public void setCurrent_stock(double current_stock) {
		this.current_stock = current_stock;
	}
	public Date getDate_of_manufacture() {
		return date_of_manufacture;
	}
	public void setDate_of_manufacture(Date date_of_manufacture) {
		this.date_of_manufacture = date_of_manufacture;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
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
		return "ProductLot [product_lot_it=" + product_lot_it + ", product_id="
				+ product_id + ", lot=" + lot + ", initial_stock="
				+ initial_stock + ", current_stock=" + current_stock
				+ ", date_of_manufacture=" + date_of_manufacture
				+ ", expiration_date=" + expiration_date + ", created_date="
				+ created_date + ", modification_date=" + modification_date
				+ "]";
	}	

}
