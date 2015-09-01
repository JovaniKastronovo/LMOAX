package org.lomejordeoax.model.product;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ct_departament")
public class Departament implements Serializable{
	
	private static final long serialVersionUID = -3851776488590584237L;
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer departament_id;
	@Column
	private String name;
	@Column
	private String description;
	
	@OneToMany(mappedBy="departament",cascade=CascadeType.ALL)
	private List<Category> categories;
	
	public Integer getDepartament_id() {
		return departament_id;
	}
	public void setDepartament_id(Integer departament_id) {
		this.departament_id = departament_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Departament [departament_id=" + departament_id + ", name="
				+ name + ", description=" + description + ", categories.size()="
				+ (categories!=null? categories.size():null) + "]";
	}

}
