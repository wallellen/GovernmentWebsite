package com.gws.zy.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {

	private int id;
	
	private String description;

	private Double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String s) {
		description = s;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(Double d) {
		price = d;
	}

	public Double getPrice() {
		return price;
	}

}
