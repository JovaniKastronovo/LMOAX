package org.lomejordeoax.model.product;

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
@Table(name="ct_unit_measure")
public class UnitMeasure implements Serializable {

	private static final long serialVersionUID = 7743182134652357337L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer unit_measure_id;
	@Column
	private String unit_measure;
	@Column
	private String description;
	@Column
	private String abbreviation;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	@Column
	private Integer company_id;
	
	public Integer getUnit_measure_id() {
		return unit_measure_id;
	}

	public void setUnit_measure_id(Integer unit_measure_id) {
		this.unit_measure_id = unit_measure_id;
	}

	public String getUnit_measure() {
		return unit_measure;
	}

	public void setUnit_measure(String unit_measure) {
		this.unit_measure = unit_measure;
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

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	@Override
	public String toString() {
		return "UnitMeasure [unit_measure_id=" + unit_measure_id
				+ ", unit_measure=" + unit_measure + ", description="
				+ description + ", abbreviation=" + abbreviation
				+ ", created_date=" + created_date + ", modification_date="
				+ modification_date + ", company_id=" + company_id + "]";
	}	
	
}
