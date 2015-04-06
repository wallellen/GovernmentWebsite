package com.gws.zy.model;

import java.sql.Timestamp;

public class MoneyResultInfo {
	private String id;

	private Timestamp createdt;

	private Timestamp updatedt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
