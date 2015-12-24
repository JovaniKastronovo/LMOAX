package org.lomejordeoax.model.address;

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
@Table(name = "ta_address")
public class Address implements Serializable {

	private static final long serialVersionUID = -1382512660835113118L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer address_id;
	
	@ManyToOne
	@JoinColumn(name = "address_type_id")
	private AddressType addressType;
	@Column
	private String street;
	@Column
	private String between_street_one;
	@Column
	private String between_street_two;
	@Column
	private String mx_manzana;
	@Column
	private String mx_lote;
	@Column
	private String interior_number;
	@Column
	private String exterior_number;
	@Column
	private String longitude;
	@Column
	private String latitude;
	@Column
	private Integer floor;
	@Column
	private String description;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	@Column
	private Integer neighborhood_id;
	@Column
	private Integer company_id;
	
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBetween_street_one() {
		return between_street_one;
	}
	public void setBetween_street_one(String between_street_one) {
		this.between_street_one = between_street_one;
	}
	public String getBetween_street_two() {
		return between_street_two;
	}
	public void setBetween_street_two(String between_street_two) {
		this.between_street_two = between_street_two;
	}
	public String getMx_manzana() {
		return mx_manzana;
	}
	public void setMx_manzana(String mx_manzana) {
		this.mx_manzana = mx_manzana;
	}
	public String getMx_lote() {
		return mx_lote;
	}
	public void setMx_lote(String mx_lote) {
		this.mx_lote = mx_lote;
	}
	public String getInterior_number() {
		return interior_number;
	}
	public void setInterior_number(String interior_number) {
		this.interior_number = interior_number;
	}
	public String getExterior_number() {
		return exterior_number;
	}
	public void setExterior_number(String exterior_number) {
		this.exterior_number = exterior_number;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getNeighborhood_id() {
		return neighborhood_id;
	}
	public void setNeighborhood_id(Integer neighborhood_id) {
		this.neighborhood_id = neighborhood_id;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [address_id=").append(address_id)
				.append(", addressType=").append(addressType)
				.append(", street=").append(street)
				.append(", between_street_one=").append(between_street_one)
				.append(", between_street_two=").append(between_street_two)
				.append(", mx_manzana=").append(mx_manzana)
				.append(", mx_lote=").append(mx_lote)
				.append(", interior_number=").append(interior_number)
				.append(", exterior_number=").append(exterior_number)
				.append(", longitude=").append(longitude).append(", latitude=")
				.append(latitude).append(", floor=").append(floor)
				.append(", description=").append(description)
				.append(", created_date=").append(created_date)
				.append(", modification_date=").append(modification_date)
				.append(", neighborhood_id=").append(neighborhood_id)
				.append(", company_id=").append(company_id).append("]");
		return builder.toString();
	}	

}
