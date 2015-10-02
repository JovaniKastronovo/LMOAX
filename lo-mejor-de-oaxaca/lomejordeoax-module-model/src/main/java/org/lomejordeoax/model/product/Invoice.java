package org.lomejordeoax.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.lomejordeoax.model.sales.Sales;

@Entity
@Table(name="ta_invoice")
public class Invoice implements Serializable {

	private static final long serialVersionUID = 113784486723504826L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer invoice_id;
	@Column
	private Date invoice_date;
	@Column
	private Integer status_id;
	@Column
	private String folio_fiscal;
	@Column
	private String certificado_sat;	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_hora_emision;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_hora_cert;
	@Column
	private String compl_cert_dig_sat;
	@Column
	private String sello_dig_emisor;
	@Column
	private String sello_dig_sat;
	@Column
	private String rfc_receptor;	
	
	@ManyToOne
	@JoinColumn(name="sale_id")
	private Sales sale;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modification_date;

	public Integer getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(Integer invoice_id) {
		this.invoice_id = invoice_id;
	}

	public Date getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getFolio_fiscal() {
		return folio_fiscal;
	}

	public void setFolio_fiscal(String folio_fiscal) {
		this.folio_fiscal = folio_fiscal;
	}

	public String getCertificado_sat() {
		return certificado_sat;
	}

	public void setCertificado_sat(String certificado_sat) {
		this.certificado_sat = certificado_sat;
	}

	public Date getFecha_hora_emision() {
		return fecha_hora_emision;
	}

	public void setFecha_hora_emision(Date fecha_hora_emision) {
		this.fecha_hora_emision = fecha_hora_emision;
	}

	public Date getFecha_hora_cert() {
		return fecha_hora_cert;
	}

	public void setFecha_hora_cert(Date fecha_hora_cert) {
		this.fecha_hora_cert = fecha_hora_cert;
	}

	public String getCompl_cert_dig_sat() {
		return compl_cert_dig_sat;
	}

	public void setCompl_cert_dig_sat(String compl_cert_dig_sat) {
		this.compl_cert_dig_sat = compl_cert_dig_sat;
	}

	public String getSello_dig_emisor() {
		return sello_dig_emisor;
	}

	public void setSello_dig_emisor(String sello_dig_emisor) {
		this.sello_dig_emisor = sello_dig_emisor;
	}

	public String getSello_dig_sat() {
		return sello_dig_sat;
	}

	public void setSello_dig_sat(String sello_dig_sat) {
		this.sello_dig_sat = sello_dig_sat;
	}

	public String getRfc_receptor() {
		return rfc_receptor;
	}

	public void setRfc_receptor(String rfc_receptor) {
		this.rfc_receptor = rfc_receptor;
	}

	public Sales getSale() {
		return sale;
	}

	public void setSale(Sales sale) {
		this.sale = sale;
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

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [invoice_id=").append(invoice_id)
				.append(", invoice_date=").append(invoice_date)
				.append(", status_id=").append(status_id)
				.append(", folio_fiscal=").append(folio_fiscal)
				.append(", certificado_sat=").append(certificado_sat)
				.append(", fecha_hora_emision=").append(fecha_hora_emision)
				.append(", fecha_hora_cert=").append(fecha_hora_cert)
				.append(", compl_cert_dig_sat=").append(compl_cert_dig_sat)
				.append(", sello_dig_emisor=").append(sello_dig_emisor)
				.append(", sello_dig_sat=").append(sello_dig_sat)
				.append(", rfc_receptor=").append(rfc_receptor)
				.append(", sale=").append(sale).append(", created_date=")
				.append(created_date).append(", modification_date=")
				.append(modification_date).append("]");
		return builder.toString();
	}
	
}
