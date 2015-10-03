package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class SucursalAddress implements Serializable {

	private static final long serialVersionUID = -348468764118933546L;
	
	private Integer sucursal_id;
	private Integer address_id;
	
	public Integer getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(Integer sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
	@Override
	public String toString() {
		return "SucursalAddress [sucursal_id=" + sucursal_id + ", address_id="
				+ address_id + "]";
	}	
	

}
