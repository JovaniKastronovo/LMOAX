package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class ProviderPhone implements Serializable {

	private static final long serialVersionUID = -1613683959467182458L;
	
	private Integer provider_id;
	private Integer phone_id;
	
	public Integer getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(Integer provider_id) {
		this.provider_id = provider_id;
	}
	public Integer getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(Integer phone_id) {
		this.phone_id = phone_id;
	}
	
	@Override
	public String toString() {
		return "ProviderPhone [provider_id=" + provider_id + ", phone_id="
				+ phone_id + "]";
	}
	
}
