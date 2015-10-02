package org.lomejordeoax.model.product;

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
@Table(name = "ta_promo_product")
public class PromoProduct implements Serializable {

	private static final long serialVersionUID = 574390355079445419L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer promo_product_id;
	@ManyToOne
	@JoinColumn(name = "promotion_id")
	private Promotions promotions;
	@Column
	private String product_id;
	@Column
	private int quantity;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getPromo_product_id() {
		return promo_product_id;
	}
	public void setPromo_product_id(Integer promo_product_id) {
		this.promo_product_id = promo_product_id;
	}
	public Promotions getPromotions() {
		return promotions;
	}
	public void setPromotions(Promotions promotions) {
		this.promotions = promotions;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		return "PromoProduct [promo_product_id=" + promo_product_id
				+ ", promotions=" + promotions + ", product_id=" + product_id
				+ ", quantity=" + quantity + ", created_date=" + created_date
				+ ", modification_date=" + modification_date + "]";
	}	
	
}
