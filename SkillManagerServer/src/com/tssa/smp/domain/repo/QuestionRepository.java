package com.tssa.smp.domain.repo;

import java.util.List;

import com.tssa.smp.domain.hibernate.QuestionCategory;
import com.tssa.smp.domain.hibernate.QuestionExt;
import com.tssa.smp.domain.hibernate.QuestionType;
public interface QuestionRepository {
	List<QuestionExt> getQuestionList();
	List<QuestionCategory> getQuestionCategories();
	QuestionExt getQuestion(int qNo);
	List<QuestionType> getQuestionTypes();
	List<Integer> getQuestionIds(String qtype);
	List getQuestion(String qtype, String id);
	List getQuestionCategory(String cid);
}
