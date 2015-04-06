package com.gws.zy.model;

import java.sql.Timestamp;

public class FarmAndAreaInfo {
	private String id;
	
	private String famid;
	
	private int type;
	
	private String area;
	
	private Timestamp createdt;
	
	private Timestamp updatedt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFamid() {
		return famid;
	}

	public void setFamid(String famid) {
		this.famid = famid;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Timestamp getCreatedt() {
		return createdt;
	}

	public void setCreatedt(Timestamp createdt) {
		this.createdt = createdt;
	}

	public Timestamp getUpdatedt() {
		return updatedt;
	}

	public void setUpdatedt(Timestamp updatedt) {
		this.updatedt = updatedt;
	}
}
