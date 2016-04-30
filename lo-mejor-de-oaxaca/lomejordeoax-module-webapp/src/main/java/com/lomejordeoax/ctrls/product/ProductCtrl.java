package com.lomejordeoax.ctrls.product;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lomejordeoax.model.to.common.MessageTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductCtrl{
	
	private static String NEXT_PRODUCT_ID_URI =  
			"http://localhost:8080/lomejordeoax-module-webservice/product/newproductId/company/{companyId}/depto/{deptoId}/category/{categoryId}";

	@RequestMapping(value = "/product/newId/", method = RequestMethod.GET)
	public @ResponseBody String getNextProdId(){	
		String nextId = new String();
		RestTemplate resTemp = new RestTemplate();
		MessageTO messageTo = resTemp.getForObject(NEXT_PRODUCT_ID_URI, MessageTO.class, 1, 1, 1);
		if(messageTo!=null){
			nextId = (String) messageTo.getObjectData();
		}		
		return nextId;
	}
	
	@RequestMapping(value="/products.html", method = RequestMethod.GET)
	public ModelAndView dashboard(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	      String now = (new Date()).toString();

	     return new ModelAndView("products", "now", now);

	}
	
}
