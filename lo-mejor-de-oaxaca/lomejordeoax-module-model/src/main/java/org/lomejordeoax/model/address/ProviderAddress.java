package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class ProviderAddress implements Serializable {

	private static final long serialVersionUID = 8141878136428860047L;
	
	private Integer provider_id;
	private Integer address_id;
	
	public Integer getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	
	@Override
	public String toString() {
		return "ProviderAddress [provider_id=" + provider_id + ", address_id="
				+ address_id + "]";
	}	
	
}
