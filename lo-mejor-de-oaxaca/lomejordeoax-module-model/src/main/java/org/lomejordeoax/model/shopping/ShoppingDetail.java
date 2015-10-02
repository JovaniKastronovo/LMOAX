package org.lomejordeoax.model.shopping;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ta_shopping_detail")
public class ShoppingDetail implements Serializable {

	private static final long serialVersionUID = -8645295847055481899L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shopping_detail_id;
	@Column
	private Integer shopping_id;
	@Column
	private String product_id;
	@Column
	private double quantity;
	@Column
	private double price;
	@Column
	private double discount;
	
	public Integer getShopping_detail_id() {
		return shopping_detail_id;
	}
	public void setShopping_detail_id(Integer shopping_detail_id) {
		this.shopping_detail_id = shopping_detail_id;
	}
	public Integer getShopping_id() {
		return shopping_id;
	}
	public void setShopping_id(Integer shopping_id) {
		this.shopping_id = shopping_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
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
	
	@Override
	public String toString() {
		return "ShoppingDetail [shopping_detail_id=" + shopping_detail_id
				+ ", shopping_id=" + shopping_id + ", product_id=" + product_id
				+ ", quantity=" + quantity + ", price=" + price + ", discount="
				+ discount + "]";
	}	

}
