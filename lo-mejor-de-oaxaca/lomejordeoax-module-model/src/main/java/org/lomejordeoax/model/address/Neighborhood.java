package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ct_neighborhood")
public class Neighborhood implements Serializable {

	private static final long serialVersionUID = -8059148120719424702L;
	
	@Id
	private Integer neighborhood_id;
	@Column
	private String name;
	@Column
	private String zip_code;
	@ManyToOne
	@JoinColumn(name = "town_id")
	private Town town;
	
	public Integer getNeighborhood_id() {
		return neighborhood_id;
	}
	public void setNeighborhood_id(Integer neighborhood_id) {
		this.neighborhood_id = neighborhood_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
}
