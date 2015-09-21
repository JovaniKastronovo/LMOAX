package org.lomejordeoax.model.product;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ta_product_sucursal")
public class ProductSucursal implements Serializable {

	private static final long serialVersionUID = 7159423957066677981L;
	
	private String product_id;

}
