package org.lomejordeoax.model.to.common;

public class ErrorMessage {
	
	private String description;
	private int code;
	private String type;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "ErrorMessage [description=" + description + ", code=" + code
				+ ", type=" + type + "]";
	}		
	
}
