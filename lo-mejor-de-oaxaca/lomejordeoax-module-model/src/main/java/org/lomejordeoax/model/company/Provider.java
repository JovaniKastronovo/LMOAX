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
@Table(name = "ct_provider")
public class Provider implements Serializable {

	private static final long serialVersionUID = -3898973430155944181L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer provider_id;
	@Column
	private String name;
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
	@Column
	private Integer status_id;
	@Column
	private String agent;
	@Column
	private double credit_limit;
	@Column
	private Integer credit_days;
	@Column
	private Integer company_id;
	@Column
	private Integer employee_id;	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ta_provider_address", 
	joinColumns ={ @JoinColumn(name = "provider_id")},
	inverseJoinColumns ={ @JoinColumn(name = "address_id") })
	private List<Address> address;
	
	public Integer getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public double getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	public Integer getCredit_days() {
		return credit_days;
	}
	public void setCredit_days(Integer credit_days) {
		this.credit_days = credit_days;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provider [provider_id=").append(provider_id)
				.append(", name=").append(name).append(", rfc=").append(rfc)
				.append(", email=").append(email).append(", fax=").append(fax)
				.append(", web_site=").append(web_site).append(", logo=")
				.append(logo).append(", commercial_business=")
				.append(commercial_business).append(", created_date=")
				.append(created_date).append(", modification_date=")
				.append(modification_date).append(", status_id=")
				.append(status_id).append(", agent=").append(agent)
				.append(", credit_limit=").append(credit_limit)
				.append(", credit_days=").append(credit_days)
				.append(", company_id=").append(company_id)
				.append(", employee_id=").append(employee_id).append("]");
		return builder.toString();
	}
}
