package com.gws.zy.model;

import java.sql.Timestamp;

public class VillageInfo {
private String id;

private String about;

private String worker;

private String plan;

private Timestamp createdt;

private Timestamp updatedt;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public String getWorker() {
	return worker;
}

public void setWorker(String worker) {
	this.worker = worker;
}

public String getPlan() {
	return plan;
}

public void setPlan(String plan) {
	this.plan = plan;
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
