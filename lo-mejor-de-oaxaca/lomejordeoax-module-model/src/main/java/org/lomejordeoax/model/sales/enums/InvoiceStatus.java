package org.lomejordeoax.model.sales.enums;

public enum InvoiceStatus {
	
	NEW(1, "Nuevo"),
	STAMPING(2, "Timbrado"),
	PRECANCELED(3, "Pre cancelado"),
	CANCELED(4, "Cancelado");
	
	
	private Integer statusId;
	private String description;
	
	InvoiceStatus(Integer statusId,String description){
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
