package org.lomejordeoax.model.taxes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ct_taxes")
public class Taxes implements Serializable {

	private static final long serialVersionUID = 351706722087814127L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tax_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String abbreviation;	
	@Column
	private double percentage;
	@Column
	private boolean print;
	@Column
	private boolean local_tax;
	@Column
	private boolean transferred;
	@Column
	private boolean retained;
	@Column
	private boolean applying_iva;
	@Column
	private Integer company_id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getTax_id() {
		return tax_id;
	}
	public void setTax_id(Integer tax_id) {
		this.tax_id = tax_id;
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
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public boolean isPrint() {
		return print;
	}
	public void setPrint(boolean print) {
		this.print = print;
	}
	public boolean isLocal_tax() {
		return local_tax;
	}
	public void setLocal_tax(boolean local_tax) {
		this.local_tax = local_tax;
	}
	public boolean isTransferred() {
		return transferred;
	}
	public void setTransferred(boolean transferred) {
		this.transferred = transferred;
	}
	public boolean isRetained() {
		return retained;
	}
	public void setRetained(boolean retained) {
		this.retained = retained;
	}
	public boolean isApplying_iva() {
		return applying_iva;
	}
	public void setApplying_iva(boolean applying_iva) {
		this.applying_iva = applying_iva;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Taxes [tax_id=").append(tax_id).append(", name=")
				.append(name).append(", description=").append(description)
				.append(", abbreviation=").append(abbreviation)
				.append(", percentage=").append(percentage).append(", print=")
				.append(print).append(", local_tax=").append(local_tax)
				.append(", transferred=").append(transferred)
				.append(", retained=").append(retained)
				.append(", applying_iva=").append(applying_iva)
				.append(", company_id=").append(company_id)
				.append(", created_date=").append(created_date)
				.append(", modification_date=").append(modification_date)
				.append("]");
		return builder.toString();
	}	
	
}
