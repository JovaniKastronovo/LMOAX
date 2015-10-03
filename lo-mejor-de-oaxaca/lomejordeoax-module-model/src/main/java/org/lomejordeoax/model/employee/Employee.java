package org.lomejordeoax.model.employee;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ta_employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -6917698804287989092L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;
	@Column
	private String first_name;
	@Column
	private String middle_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private Date birth_date;
	@Column
	private Date hire_date;
	@Column
	private char sex;
	@Column
	private Integer status_id;
	@Column
	private Integer sucursal_id;
	@Column
	private Integer edit_employee_id;
	@Column
	private Integer company_id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Integer getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}
	public Integer getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(Integer sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public Integer getEdit_employee_id() {
		return edit_employee_id;
	}
	public void setEdit_employee_id(Integer edit_employee_id) {
		this.edit_employee_id = edit_employee_id;
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
		builder.append("Employee [employee_id=").append(employee_id)
				.append(", first_name=").append(first_name)
				.append(", middle_name=").append(middle_name)
				.append(", last_name=").append(last_name).append(", email=")
				.append(email).append(", birth_date=").append(birth_date)
				.append(", hire_date=").append(hire_date).append(", sex=")
				.append(sex).append(", status_id=").append(status_id)
				.append(", sucursal_id=").append(sucursal_id)
				.append(", edit_employee_id=").append(edit_employee_id)
				.append(", company_id=").append(company_id)
				.append(", created_date=").append(created_date)
				.append(", modification_date=").append(modification_date)
				.append("]");
		return builder.toString();
	}

}
