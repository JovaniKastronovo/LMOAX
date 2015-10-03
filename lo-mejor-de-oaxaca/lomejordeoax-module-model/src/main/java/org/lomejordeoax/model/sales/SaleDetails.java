package org.lomejordeoax.model.sales;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lomejordeoax.model.product.Product;

@Entity
@Table(name = "ta_sale_details")
public class SaleDetails implements Serializable {

	private static final long serialVersionUID = 2475715399351197734L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sale_detail_id;
	@Column
	private double quantity;
	@Column
	private double price;
	@Column
	private double discount;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "sale_id")
	private Sales sale;

	public Integer getSale_detail_id() {
		return sale_detail_id;
	}

	public void setSale_detail_id(Integer sale_detail_id) {
		this.sale_detail_id = sale_detail_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sales getSale() {
		return sale;
	}

	public void setSale(Sales sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "SaleDetails [sale_detail_id=" + sale_detail_id + ", quantity="
				+ quantity + ", price=" + price + ", discount=" + discount
				+ ", product=" + product + ", sale=" + sale + "]";
	}

	
}
