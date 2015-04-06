package com.gws.zy.model;

import java.sql.Timestamp;

public class FamilyAndMoneyInfo {
	private String id;
	private String userid;
	private float money;
	private String houseArea;
	private Timestamp createdt;
	private Timestamp updatedt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getHouseArea() {
		return houseArea;
	}
	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
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
