package com.gws.zy.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gws.zy.model.ProductManager;

public class ProductController implements Controller {

    private ProductManager prodMan;

	@SuppressWarnings("unchecked")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
        String now = (new java.util.Date()).toString(); 

        Map myModel = new HashMap();
        myModel.put("now", now);
        myModel.put("products", getProductManager().getProducts());

        return new ModelAndView("product", "model", myModel);
	}

    public void setProductManager(ProductManager pm) {
        prodMan = pm;
    }

    public ProductManager getProductManager() {
        return prodMan;
    }

}
