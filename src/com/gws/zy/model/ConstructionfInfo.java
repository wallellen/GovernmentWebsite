package com.gws.zy.model;

import java.sql.Timestamp;

public class ConstructionfInfo {
	private String id;

	private String applicant;

	private String content;

	private Timestamp createdt;

	private Timestamp updatedt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
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
}
