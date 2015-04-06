package com.gws.zy.model;

import java.sql.Timestamp;

public class PeopleInsuranceInfo {
	private String id;

	private String famid;

	private int type;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	private String content;

	private Timestamp createdt;

	private Timestamp updatedt;

}
