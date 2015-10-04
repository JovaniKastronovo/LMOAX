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
@Table(name = "ta_company")
public class Company implements Serializable {

	private static final long serialVersionUID = -7320561403785894577L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer company_id;
	@Column
	private String company_name;
	@Column
	private String rfc;
	@Column
	private String email;
	@Column
	private String fax;
	@Column
	private String web_site;
	@Column
	private String logo;
	@Column
	private String commercial_business;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ta_company_address", 
	joinColumns ={ @JoinColumn(name = "company_id")},
	inverseJoinColumns ={ @JoinColumn(name = "address_id") })
	private List<Address> address;
	
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWeb_site() {
		return web_site;
	}
	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getCommercial_business() {
		return commercial_business;
	}
	public void setCommercial_business(String commercial_business) {
		this.commercial_business = commercial_business;
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
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [company_id=").append(company_id)
				.append(", company_name=").append(company_name)
				.append(", rfc=").append(rfc).append(", email=").append(email)
				.append(", fax=").append(fax).append(", web_site=")
				.append(web_site).append(", logo=").append(logo)
				.append(", commercial_business=").append(commercial_business)
				.append(", created_date=").append(created_date)
				.append(", modification_date=").append(modification_date)
				.append(", address=").append(address).append("]");
		return builder.toString();
	}		

}
