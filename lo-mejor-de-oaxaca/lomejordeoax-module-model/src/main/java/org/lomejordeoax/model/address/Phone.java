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
@Table(name = "ta_phone")
public class Phone implements Serializable {

	private static final long serialVersionUID = 3515526931704659963L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer phone_id;
	@Column
	private String number;
	@Column
	private String extension;
	@Column
	private boolean mobile;
	@ManyToOne
	@JoinColumn(name="phone_type_id")
	private PhoneType phoneType;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(Integer phone_id) {
		this.phone_id = phone_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public boolean isMobile() {
		return mobile;
	}
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
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
		return "Phone [phone_id=" + phone_id + ", number=" + number
				+ ", extension=" + extension + ", mobile=" + mobile
				+ ", phoneType=" + phoneType + ", created_date=" + created_date
				+ ", modification_date=" + modification_date + "]";
	}		
	
}
