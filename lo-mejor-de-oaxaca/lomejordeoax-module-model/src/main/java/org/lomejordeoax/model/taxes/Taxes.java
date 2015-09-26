package org.lomejordeoax.model.taxes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "ct_taxes")
public class Taxes implements Serializable {

	private static final long serialVersionUID = 351706722087814127L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tax_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private double percentage;
	@Column
	private int print;
	@Column
	private int local_tax;
	@Column
	private int transferred;
	@Column
	private int retained;
	@Column
	private int applying_iva;
	@Column
	private Integer company_id;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getPrint() {
		return print;
	}
	public void setPrint(int print) {
		this.print = print;
	}
	public int getLocal_tax() {
		return local_tax;
	}
	public void setLocal_tax(int local_tax) {
		this.local_tax = local_tax;
	}
	public int getTransferred() {
		return transferred;
	}
	public void setTransferred(int transferred) {
		this.transferred = transferred;
	}
	public int getRetained() {
		return retained;
	}
	public void setRetained(int retained) {
		this.retained = retained;
	}
	public int getApplying_iva() {
		return applying_iva;
	}
	public void setApplying_iva(int applying_iva) {
		this.applying_iva = applying_iva;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	
	@Override
	public String toString() {
		return "Taxes [tax_id=" + tax_id + ", name=" + name + ", description="
				+ description + ", percentage=" + percentage + ", print="
				+ print + ", local_tax=" + local_tax + ", transferred="
				+ transferred + ", retained=" + retained + ", applying_iva="
				+ applying_iva + ", company_id=" + company_id + "]";
	}

	
}
