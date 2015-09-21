package org.lomejordeoax.model.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private Integer status_id;
	
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
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	
	@Override
	public String toString() {
		return "ProductPhotos [product_photos_id=" + product_photos_id
				+ ", product_id=" + product_id + ", path=" + path
				+ ", status_id=" + status_id + "]";
	}
	
}
