package org.lomejordeoax.model.shopping;

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
@Table(name = "ta_shopping_detail")
public class ShoppingDetail implements Serializable {

	private static final long serialVersionUID = -8645295847055481899L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shopping_detail_id;
	@Column
	private double quantity;
	@Column
	private double price;
	@Column
	private double discount;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public Integer getShopping_detail_id() {
		return shopping_detail_id;
	}
	public void setShopping_detail_id(Integer shopping_detail_id) {
		this.shopping_detail_id = shopping_detail_id;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShoppingDetail [shopping_detail_id=")
				.append(shopping_detail_id).append(", quantity=")
				.append(quantity).append(", price=").append(price)
				.append(", discount=").append(discount).append(", product=")
				.append(product).append("]");
		return builder.toString();
	}		

}
