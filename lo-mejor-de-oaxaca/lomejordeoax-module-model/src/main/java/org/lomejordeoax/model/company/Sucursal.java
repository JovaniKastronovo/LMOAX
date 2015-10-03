package org.lomejordeoax.model.company;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.lomejordeoax.model.address.Address;

@Entity
@Table(name = "ta_sucursal")
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 5948541167661685976L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sucursal_id;
	@Column
	private Integer company_id;
	@Column
	private String name;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	@Column
	private String description;
	@Column
	private Integer matriz_sucursal_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ta_sucursal_address", 
	joinColumns ={ @JoinColumn(name = "sucursal_id")},
	inverseJoinColumns ={ @JoinColumn(name = "address_id") })
	private List<Address> address;
	
	public Integer getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(Integer sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getMatriz_sucursal_id() {
		return matriz_sucursal_id;
	}
	public void setMatriz_sucursal_id(Integer matriz_sucursal_id) {
		this.matriz_sucursal_id = matriz_sucursal_id;
	}
	
	@Override
	public String toString() {
		return "Sucursal [sucursal_id=" + sucursal_id + ", company_id="
				+ company_id + ", name=" + name + ", created_date="
				+ created_date + ", modification_date=" + modification_date
				+ ", description=" + description + ", matriz_sucursal_id="
				+ matriz_sucursal_id + "]";
	}	

}
