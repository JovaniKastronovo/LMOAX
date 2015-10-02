package org.lomejordeoax.model.sales;

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
@Table(name = "ta_sale")
public class Sales implements Serializable {

	private static final long serialVersionUID = 5330263122632358635L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sale_id;
	@Column
	private Integer employee_id;
	@Column
	private Integer customer_id;
	@Column
	private Integer status_id;
	@Column
	private Integer sucursal_id;
	@Column
	private Date delivery_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	@Column
	private MethodOfPayment methodOfPayment;
	@Column
	private String comments;
	@Column
	private DocumentSale documentSale;
	@Column
	private TypeOfCurrency typeOfCurrency;
	
	
	public Integer getSale_id() {
		return sale_id;
	}
	public void setSale_id(Integer sale_id) {
		this.sale_id = sale_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
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
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public Date getModification_date() {
		return modification_date;
	}
	public void setModification_date(Date modification_date) {
		this.modification_date = modification_date;
	}
	public MethodOfPayment getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(MethodOfPayment methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public DocumentSale getDocumentSale() {
		return documentSale;
	}
	public void setDocumentSale(DocumentSale documentSale) {
		this.documentSale = documentSale;
	}
	public TypeOfCurrency getTypeOfCurrency() {
		return typeOfCurrency;
	}
	public void setTypeOfCurrency(TypeOfCurrency typeOfCurrency) {
		this.typeOfCurrency = typeOfCurrency;
	}
	@Override
	public String toString() {
		return "Sales [sale_id=" + sale_id + ", employee_id=" + employee_id
				+ ", customer_id=" + customer_id + ", status_id=" + status_id
				+ ", sucursal_id=" + sucursal_id + ", created_date="
				+ created_date + ", delivery_date=" + delivery_date
				+ ", modification_date=" + modification_date + ", comments="
				+ comments + "]";
	}
	

}
