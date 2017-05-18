package com.tssa.smp.domain.hibernate;

import java.sql.Timestamp;

import com.tssa.smp.core.entity.AbstractEntity;

public class QuestionType extends AbstractEntity {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	public Timestamp getCreatedTs() {
		return createdTs;
	}
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private Timestamp createdTs;
}
