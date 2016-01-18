package org.lomejordeoax.model.sales.enums;

public enum ShoppingStatus {

	ACTIVE(1, "Nuevo"),
	CLOSE(2, "Confirmado"),
	DELIVERED(3, "Etregado"),
	CANCELED(4, "Cancelado");	
	
	private Integer statusId;
	private String description;
	
	ShoppingStatus(Integer statusId,String description){
		this.statusId = statusId;
		this.description = description;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
