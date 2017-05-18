package com.tssa.smp.domain.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.tssa.smp.domain.hibernate.QuestionCategory;
import com.tssa.smp.domain.hibernate.QuestionType;

import com.tssa.smp.domain.hibernate.QuestionExt;
import com.tssa.smp.util.QType;

public interface QuestionService{
	QuestionExt getQuestion(int qNo);
	List<QuestionCategory> getQuestionCategories();
	List<QuestionExt> getAllQuestions();
	List<QuestionType> getQuestionTypes();
	List<Integer> getQuestionIds(String qtype);
	Object[] getQuestion(String qtype, String id);
	QuestionCategory getQuestionCategory(String cid);
}
