package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ta_customer_phone")
public class CustomerPhone implements Serializable {

	private static final long serialVersionUID = -3220753895108515356L;
	
	@Column
	private Integer customer_id;
	@Column
	private Integer phone_id;
	
	@Override
	public String toString() {
		return "CustomerPhone [customer_id=" + customer_id + ", phone_id="
				+ phone_id + "]";
	}
	
}
