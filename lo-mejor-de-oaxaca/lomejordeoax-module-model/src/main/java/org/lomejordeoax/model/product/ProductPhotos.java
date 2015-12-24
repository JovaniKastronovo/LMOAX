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
@Table(name = "ta_product_photos")
public class ProductPhotos implements Serializable {

	private static final long serialVersionUID = -7434545191332465491L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_photos_id;
	@Column
	private String product_id;
	@Column
	private String path;
	@Column
	private boolean active;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	
	public Integer getProduct_photos_id() {
		return product_photos_id;
	}
	public void setProduct_photos_id(Integer product_photos_id) {
		this.product_photos_id = product_photos_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
		return "ProductPhotos [product_photos_id=" + product_photos_id
				+ ", product_id=" + product_id + ", path=" + path
				+ ", active=" + active + ", created_date=" + created_date
				+ ", modification_date=" + modification_date + "]";
	}
	
}
