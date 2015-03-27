package com.gws.zy.dao;

import java.util.List;

import com.gws.zy.model.*;

public interface ProductManagerDao {

	public List<Product> getProductList();
	
	public void addProduct( Product p );

}
