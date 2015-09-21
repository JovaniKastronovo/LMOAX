package org.lomejordeoax.model.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ct_category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = -243174998100310543L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer category_id;
	@Column
	private String description;
	@Column
	private String picture;
	@Column
	private Integer company_id;
	
	@ManyToOne
	@JoinColumn(name="departament_id")
	private Departament departament;
			
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
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", description="
				+ description + ", picture=" + picture + ", company_id="
				+ company_id + ", departament=" + departament + "]";
	}
	
}
