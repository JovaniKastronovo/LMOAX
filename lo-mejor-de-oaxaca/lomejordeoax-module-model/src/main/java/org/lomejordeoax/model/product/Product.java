package org.lomejordeoax.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ta_product")
public class Product implements Serializable {

	private static final long serialVersionUID = -7687950841206027214L;
	
	@Id
	private String product_id;
	@Column
	private String product_key;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String abbrevation;
	@Column
	private int service;
	@Column
	private double factor;
	@Column
	private double lot;
	@Column
	private int net_price;
	@Column
	private int prescription;
	@Column
	private int granel;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;	
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="unit_sale_id")
	private UnitMeasure unitSale;
	
	@ManyToOne
	@JoinColumn(name="unit_buy_id")
	private UnitMeasure unitBuy;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_key() {
		return product_key;
	}
	public void setProduct_key(String product_key) {
		this.product_key = product_key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}	
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	public double getLot() {
		return lot;
	}
	public void setLot(double lot) {
		this.lot = lot;
	}
	public int getNet_price() {
		return net_price;
	}
	public void setNet_price(int net_price) {
		this.net_price = net_price;
	}
	public int getPrescription() {
		return prescription;
	}
	public void setPrescription(int prescription) {
		this.prescription = prescription;
	}
	public int getGranel() {
		return granel;
	}
	public void setGranel(int granel) {
		this.granel = granel;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getModification_date() {
		return modification_date;
	}
	public void setModification_date(Date modification_date) {
		this.modification_date = modification_date;
	}	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public UnitMeasure getUnitSale() {
		return unitSale;
	}
	public void setUnitSale(UnitMeasure unitSale) {
		this.unitSale = unitSale;
	}
	public UnitMeasure getUnitBuy() {
		return unitBuy;
	}
	public void setUnitBuy(UnitMeasure unitBuy) {
		this.unitBuy = unitBuy;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [product_id=");	builder.append(product_id);	builder.append(", product_key=");
		builder.append(product_key); builder.append(", name=");	builder.append(name); builder.append(", description=");
		builder.append(description); builder.append(", abbrevation="); builder.append(abbrevation);
		builder.append(", service="); builder.append(service); builder.append(", factor=");
		builder.append(factor);	builder.append(", lot="); builder.append(lot); builder.append(", net_price=");
		builder.append(net_price); builder.append(", prescription="); builder.append(prescription);
		builder.append(", granel="); builder.append(granel); builder.append(", created_date=");
		builder.append(created_date); builder.append(", modification_date="); builder.append(modification_date);
		builder.append(", category="); builder.append(category); builder.append(", departament=");
		builder.append(", unitSale="); builder.append(unitSale);
		builder.append(", unitBuy="); builder.append(unitBuy); builder.append("]");
		return builder.toString();
	}	
	
}
