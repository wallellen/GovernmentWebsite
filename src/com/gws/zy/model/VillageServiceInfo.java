package com.gws.zy.model;

import java.sql.Timestamp;

public class VillageServiceInfo {
	private String id;

	private String annualWorkPlan;

	private String villaagerGroupMember;

	private String moneyGroupMember;

	private Timestamp createdt;

	private Timestamp updatedt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAnnualWorkPlan() {
		return annualWorkPlan;
	}

	public void setAnnualWorkPlan(String annualWorkPlan) {
		this.annualWorkPlan = annualWorkPlan;
	}

	public String getVillaagerGroupMember() {
		return villaagerGroupMember;
	}

	public void setVillaagerGroupMember(String villaagerGroupMember) {
		this.villaagerGroupMember = villaagerGroupMember;
	}

	public String getMoneyGroupMember() {
		return moneyGroupMember;
	}

	public void setMoneyGroupMember(String moneyGroupMember) {
		this.moneyGroupMember = moneyGroupMember;
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
