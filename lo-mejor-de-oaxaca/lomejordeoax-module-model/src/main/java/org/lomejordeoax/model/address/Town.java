package org.lomejordeoax.model.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ct_town")
public class Town implements Serializable {

	private static final long serialVersionUID = 4620354307040295581L;
	
	@Id
	private Integer town_id;
	@Column
	private String name;
	@Column
	private String type;
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;
	public Integer getTown_id() {
		return town_id;
	}
	public void setTown_id(Integer town_id) {
		this.town_id = town_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Town [town_id=" + town_id + ", name=" + name + ", type=" + type
				+ ", state=" + state + "]";
	}

}
