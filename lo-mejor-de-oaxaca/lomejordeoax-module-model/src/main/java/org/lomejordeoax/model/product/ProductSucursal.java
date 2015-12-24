package org.lomejordeoax.model.product;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ta_product_sucursal")
public class ProductSucursal implements Serializable {

	private static final long serialVersionUID = 7159423957066677981L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_sucursal_id;
	@Column
	private Integer sucursal_id;
	@Column
	private double price;
	@Column
	private double stock;
	@Column
	private Integer provider_id;
	@Column
	private Integer employee_id;
	@Column
	private Integer product_status_id;
	@Column
	private double purchase_price;
	@Column
	private double min_stock;
	@Column
	private double max_stock;
	@Column
	private String location;
	
	@ManyToOne(cascade = CascadeType.ALL)
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
	
	public Integer getProduct_status_id() {
		return product_status_id;
	}

	public void setProduct_status_id(Integer product_status_id) {
		this.product_status_id = product_status_id;
	}

	public double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}

	public double getMin_stock() {
		return min_stock;
	}

	public void setMin_stock(double min_stock) {
		this.min_stock = min_stock;
	}

	public double getMax_stock() {
		return max_stock;
	}

	public void setMax_stock(double max_stock) {
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

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getProduct_sucursal_id() {
		return product_sucursal_id;
	}

	public void setProduct_sucursal_id(Integer product_sucursal_id) {
		this.product_sucursal_id = product_sucursal_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductSucursal [product_sucursal_id=")
				.append(product_sucursal_id).append(", sucursal_id=")
				.append(sucursal_id).append(", price=").append(price)
				.append(", stock=").append(stock).append(", provider_id=")
				.append(provider_id).append(", employee_id=")
				.append(employee_id).append(", product_status_id=").append(product_status_id)
				.append(", purchase_price=").append(purchase_price)
				.append(", min_stock=").append(min_stock)
				.append(", max_stock=").append(max_stock).append(", location=")
				.append(location).append(", product=").append(product)
				.append("]");
		return builder.toString();
	}	

}
