package org.lomejordeoax.model.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ta_product_sucursal")
public class ProductSucursal implements Serializable {

	private static final long serialVersionUID = 7159423957066677981L;
	
	@Column
	private Integer sucursal_id;
	@Column
	private double price;
	@Column
	private double stock;
	@Column
	private Integer provider_id;
	@Column
	private Integer status_id;
	@Column
	private double purchase_price;
	@Column
	private int min_stock;
	@Column
	private int max_stock;
	@Column
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Integer getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Integer sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public Integer getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}

	public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}

	public int getMin_stock() {
		return min_stock;
	}

	public void setMin_stock(int min_stock) {
		this.min_stock = min_stock;
	}

	public int getMax_stock() {
		return max_stock;
	}

	public void setMax_stock(int max_stock) {
		this.max_stock = max_stock;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductSucursal [sucursal_id=" + sucursal_id + ", price="
				+ price + ", stock=" + stock + ", provider_id=" + provider_id
				+ ", status_id=" + status_id + ", purchase_price="
				+ purchase_price + ", min_stock=" + min_stock + ", max_stock="
				+ max_stock + ", location=" + location + ", product=" + product
				+ "]";
	}	

}
