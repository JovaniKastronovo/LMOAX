package org.lomejordeoax.model.vo.product;

import java.util.List;

public class ProductVO {
	
	private Integer productId;
	private String productKey;
	private String name;
	private int service;
	private Integer categoryId;
	private double minStock;
	private double maxStock;
	private String location; 
	private double stock;
	private double lot;
	private double prescription;
	private double granel;
	private Integer salesUnitId;
	private Integer unitBuy;
	private double factor;
	private double purchasePrice;
	private double netPrice;
	private String description;
	
	private List<Integer> taxesId;
	private List<SalePriceVO> salePrice;
	private List<Photos> photos;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public double getMinStock() {
		return minStock;
	}
	public void setMinStock(double minStock) {
		this.minStock = minStock;
	}
	public double getMaxStock() {
		return maxStock;
	}
	public void setMaxStock(double maxStock) {
		this.maxStock = maxStock;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	public double getLot() {
		return lot;
	}
	public void setLot(double lot) {
		this.lot = lot;
	}
	public double getPrescription() {
		return prescription;
	}
	public void setPrescription(double prescription) {
		this.prescription = prescription;
	}
	public double getGranel() {
		return granel;
	}
	public void setGranel(double granel) {
		this.granel = granel;
	}
	public Integer getSalesUnitId() {
		return salesUnitId;
	}
	public void setSalesUnitId(Integer salesUnitId) {
		this.salesUnitId = salesUnitId;
	}
	public Integer getUnitBuy() {
		return unitBuy;
	}
	public void setUnitBuy(Integer unitBuy) {
		this.unitBuy = unitBuy;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Integer> getTaxesId() {
		return taxesId;
	}
	public void setTaxesId(List<Integer> taxesId) {
		this.taxesId = taxesId;
	}
	public List<SalePriceVO> getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(List<SalePriceVO> salePrice) {
		this.salePrice = salePrice;
	}
	public List<Photos> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}
	

}
