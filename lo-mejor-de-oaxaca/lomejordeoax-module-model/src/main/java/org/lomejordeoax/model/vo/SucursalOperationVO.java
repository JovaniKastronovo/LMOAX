package org.lomejordeoax.model.vo;

public class SucursalOperationVO {
	
	private Integer sucursalId;
	private Integer companyId;
	private Integer employeeId;
	private String ipAddress;
	
	public Integer getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	@Override
	public String toString() {
		return "SucursalOperationVO [sucursalId=" + sucursalId + ", companyId="
				+ companyId + ", employeeId=" + employeeId + ", ipAddress="
				+ ipAddress + "]";
	}	

}
