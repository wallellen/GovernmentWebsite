package com.gws.zy.model;

import java.io.Serializable;
import java.util.List;

import com.gws.zy.dao.ProductManagerDao;

@SuppressWarnings("serial")
public class ProductManager implements Serializable {

	// private List products;

	private ProductManagerDao pmd;
	
	/**
	public void setProducts(List p) {
		products = p;
	}
	*/

	public List getProducts() {
		// return products;
		return pmd.getProductList();
	}

    public void addProduct( Product p ) {
    		// products.add( p );
    		pmd.addProduct( p );
    }
    
    public void setProductManagerDao( ProductManagerDao dao ) {
    		this.pmd = dao;
    }

    public ProductManagerDao getProductManagerDao( ) {
    		return this.pmd;
    }
}
