package org.lomejordeoax.model.shopping;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.lomejordeoax.model.sales.MethodOfPayment;

@Entity
@Table(name = "ta_shopping")
public class Shopping implements Serializable {

	private static final long serialVersionUID = 356802122908427227L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shopping_id;
	@Column
	private Integer provider_id;
	@Column
	private Integer employee_id;
	@Column
	private Integer sucursal_id;
	@Column
	private Integer shopping_status_id;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.DATE)
	private Date delivery_date;
	@ManyToOne
	@JoinColumn(name="method_payment_id")
	private MethodOfPayment methodOfPayment;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;
	@Column
	@Temporal(TemporalType.DATE)
	private Date purchase_date;
	
	@OneToMany(fetch =FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "shopping_id",nullable = false)
	private List<ShoppingDetail> shoppingDetails;
	
	
	public Integer getShopping_id() {
		return shopping_id;
	}
	public void setShopping_id(Integer shopping_id) {
		this.shopping_id = shopping_id;
	}
	public Integer getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
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
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public List<ShoppingDetail> getShoppingDetails() {
		return shoppingDetails;
	}
	public void setShoppingDetails(List<ShoppingDetail> shoppingDetails) {
		this.shoppingDetails = shoppingDetails;
	}
	public Integer getShopping_status_id() {
		return shopping_status_id;
	}
	public void setShopping_status_id(Integer shopping_status_id) {
		this.shopping_status_id = shopping_status_id;
	}
	public MethodOfPayment getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(MethodOfPayment methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shopping [shopping_id=").append(shopping_id)
				.append(", provider_id=").append(provider_id)
				.append(", employee_id=").append(employee_id)
				.append(", sucursal_id=").append(sucursal_id)
				.append(", shopping_status_id=").append(shopping_status_id)
				.append(", created_date=").append(created_date)
				.append(", delivery_date=").append(delivery_date)
				.append(", methodOfPayment=").append(methodOfPayment)
				.append(", modification_date=").append(modification_date)
				.append(", purchase_date=").append(purchase_date)
				.append(", shoppingDetails=").append(shoppingDetails)
				.append("]");
		return builder.toString();
	}	
	
	
}
