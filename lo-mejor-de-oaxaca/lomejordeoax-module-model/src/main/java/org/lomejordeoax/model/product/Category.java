package org.lomejordeoax.model.product;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ct_category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = -243174998100310543L;
	
	@Id
	@Column(name = "prod_category_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer category_id;
	@Column
	private String description;
	@Column
	private String picture;
	
	@ManyToOne
	@JoinColumn(name="departament_id")
	private Departament departament;
	
	@OneToMany(mappedBy="category",cascade = CascadeType.ALL)
	private List<Product> products;
		
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	@Override
	public String toString() {
		return "Category [prod_category_id=" + category_id
				+ ", description=" + description + ", picture=" + picture
				+ ", departament=" + departament + ", products.size()=" + (products!=null?products.size():null)
				+ "]";
	}	
	
}
