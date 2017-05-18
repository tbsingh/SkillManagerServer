package com.tssa.smp.domain.hibernate;

import java.sql.Timestamp;

import com.tssa.smp.core.entity.AbstractEntity;
import com.tssa.smp.domain.hibernate.QuestionExt;

public class QuestionAnswer extends AbstractEntity {
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	public Timestamp getCreatedTs() {
		return createdTs;
	}
	public void setOption(QuestionOption option) {
		this.option = option;
	}
	public QuestionOption getOption() {
		return option;
	}
	private static final long serialVersionUID = 1L;
	private QuestionOption option;
	private String text;
	private Timestamp createdTs;
}

