package org.lomejordeoax.model.to.common;

public enum ErrorType {
	
	ERROR(1,"Error"),
	WARNING(2,"Warning");
	
	private final int id;
	private final String description;
	private ErrorType(int id,String description){
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	
	

}
