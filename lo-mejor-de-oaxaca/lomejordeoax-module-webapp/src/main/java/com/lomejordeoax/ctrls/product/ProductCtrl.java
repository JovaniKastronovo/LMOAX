package com.lomejordeoax.ctrls.product;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lomejordeoax.model.product.Category;
import org.lomejordeoax.model.product.Departament;
import org.lomejordeoax.model.to.common.MessageTO;
import org.lomejordeoax.utilities.commons.Util;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lomejordeoax.ctrls.IFrontController;
import com.lomejordeoax.ctrls.exceptions.EmptyReponseException;
import com.lomejordeoax.ctrls.exceptions.ErrorMessageRespException;

@SuppressWarnings("unchecked")
@RestController
public class ProductCtrl implements IFrontController{
	
	private static String SERVICE_CONTEXT = "http://localhost:8080/lomejordeoax-module-webservice/";	
	private static String NEXT_PRODUCT_ID_SERV =  SERVICE_CONTEXT + "product/newproductId/company/{companyId}/depto/{deptoId}/category/{categoryId}";
	private static String CATEGORY_BY_COMPANY_SERV = SERVICE_CONTEXT + "product/category/company/{companyId}";
	private static String DEPTO_BY_COMPANY_SERV = SERVICE_CONTEXT + "product/depto/company/{companyId}";

	@RequestMapping(value = "/product/newId.html", method = RequestMethod.GET)
	public String getNextProdId(){
		RestTemplate resTemp = new RestTemplate();
		MessageTO messageTo = resTemp.getForObject(NEXT_PRODUCT_ID_SERV, MessageTO.class, 1, 1, 1);
		validateResponse(messageTo);
		return (String) messageTo.getObjectData();
	}		
	
	@RequestMapping(value = "/product/categories.json", method = RequestMethod.GET)
	public List<Category> categoryByCompany(){	
		RestTemplate resTemp = new RestTemplate();
		MessageTO messageTo = resTemp.getForObject(CATEGORY_BY_COMPANY_SERV, MessageTO.class, 1);
		validateResponse(messageTo);
		return (List<Category>) messageTo.getObjectData();		
	}
	
	@RequestMapping(value = "/product/deptos.json", method = RequestMethod.GET)
	public List<Departament> deptoByCompany(){
		RestTemplate resTemp = new RestTemplate();
		MessageTO messageTo = resTemp.getForObject(DEPTO_BY_COMPANY_SERV, MessageTO.class, 1);		
		validateResponse(messageTo);
		return (List<Departament>) messageTo.getObjectData();
	}
	
	@RequestMapping(value="/products.html", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	      String now = (new Date()).toString();

	     return new ModelAndView("products", "now", now);

	}

	@Override
	public void validateResponse(MessageTO messageTo)
			throws RuntimeException {
		if(messageTo==null)
			throw new EmptyReponseException("No hay respuesta del servicio, el message de respuesta es NULL");
		if(messageTo.getErrors()!=null && messageTo.getErrors().size()>0)
			throw new ErrorMessageRespException(Util.concatError(messageTo.getErrors()));
		if(messageTo.getObjectData()==null)
			throw new EmptyReponseException("No hay datos de respuesta por parte del servicio");				
	}
}
