package org.lomejordeoax.model.sales.enums;

public enum SaleStatus {

	ACTIVE(2, "Activo"),
	CLOSE(3, "Cerrado"),
	CANCELED(4, "Cancelado");
	
	
	private Integer statusId;
	private String description;
	
	SaleStatus(Integer statusId,String description){
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
