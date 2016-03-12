package com.lomejordeoax.rest.ctrls.product;

import java.util.ArrayList;
import java.util.Date;

import org.lomejordeoax.model.product.ProductSucursal;
import org.lomejordeoax.model.to.common.ErrorMessage;
import org.lomejordeoax.model.to.common.ErrorType;
import org.lomejordeoax.model.to.common.IController;
import org.lomejordeoax.model.to.common.MessageTO;
import org.lomejordeoax.utilities.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lomejordeoax.bll.ProductManager;

@RestController
@RequestMapping(value = "/product/")
public class ProductRestCtrl implements IController{	
	
	@Autowired
	private ProductManager productManager;
	
	
	@RequestMapping(value="newproductId/company/{companyId}/depto/{deptoId}/category/{categoryId}",
			method = RequestMethod.GET)
	public ResponseEntity<MessageTO> generateProductId(
			@PathVariable("companyId") int companyId,
			@PathVariable("deptoId") int deptoId,
			@PathVariable("categoryId") int categoryId){
		MessageTO message = new MessageTO();
		try {
			String nextProductId = productManager.generateProductId(companyId, deptoId, categoryId);
			message.setObjectData(nextProductId);
			return new ResponseEntity<MessageTO>(message,HttpStatus.OK);
		} catch (BusinessException e) {
			addErrorMessage(message, e.getMessage());
			return new ResponseEntity<MessageTO>(message,HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			addErrorMessage(message, e.getMessage());
			return new ResponseEntity<MessageTO>(message,HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="save/", method = RequestMethod.POST)
	public ResponseEntity<MessageTO> saveProductSucursal(@RequestBody ProductSucursal prodSucursal){
		MessageTO message = new MessageTO();
		try {
			prodSucursal.getProduct().setCreated_date(new Date());
			prodSucursal.getProduct().setModification_date(new Date());
			productManager.saveProductSuc(prodSucursal);
			return new ResponseEntity<MessageTO>(message,HttpStatus.OK);
		} catch (BusinessException e) {
			addErrorMessage(message, e.getMessage());
			return new ResponseEntity<MessageTO>(message,HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			addErrorMessage(message, e.getMessage());
			return new ResponseEntity<MessageTO>(message,HttpStatus.NOT_FOUND);
		}
	}


	@Override
	public MessageTO addErrorMessage(MessageTO messageTO, String descError) {
		ErrorMessage errormsg = new ErrorMessage();		
		errormsg.setDescription(descError);
		errormsg.setType(ErrorType.ERROR.getDescription());
		
		if(messageTO.getErrors() == null){
			messageTO.setErrors(new ArrayList<ErrorMessage>());
			messageTO.getErrors().add(errormsg);
		}else
			messageTO.getErrors().add(errormsg);
		
		return messageTO;
	}
}
