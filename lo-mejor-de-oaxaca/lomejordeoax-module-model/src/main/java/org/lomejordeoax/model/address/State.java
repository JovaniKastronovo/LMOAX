package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ct_state")
public class State implements Serializable {

	private static final long serialVersionUID = 4443429627279206707L;
	
	@Id
	private Integer state_id;
	@Column
	private String name;
	@Column
	private String bc_key;
	
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBc_key() {
		return bc_key;
	}
	public void setBc_key(String bc_key) {
		this.bc_key = bc_key;
	}
	
	@Override
	public String toString() {
		return "State [state_id=" + state_id + ", name=" + name + ", bc_key="
				+ bc_key + "]";
	}

}
