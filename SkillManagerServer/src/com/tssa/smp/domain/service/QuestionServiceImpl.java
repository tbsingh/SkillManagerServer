package com.tssa.smp.domain.service;

import java.util.List;

import com.tssa.smp.domain.hibernate.QuestionExt;
import com.tssa.smp.domain.hibernate.QuestionType;
import com.tssa.smp.domain.repo.HibernateQuestionRepository;
import com.tssa.smp.domain.repo.QuestionRepository;
import com.tssa.smp.domain.Question;
import com.tssa.smp.domain.hibernate.QuestionCategory;
import com.tssa.smp.util.QType;

public class QuestionServiceImpl implements QuestionService {

	@Override
	public
	QuestionExt getQuestion(int qNo) {
		return questionRepository.getQuestion(qNo);
	}

	@Override
	public List<QuestionExt> getAllQuestions() {
		return questionRepository.getQuestionList();
	}
	public void setQuestionRepository(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	@Override
	public List<QuestionCategory> getQuestionCategories(){
		return questionRepository.getQuestionCategories();
	}
	public QuestionRepository getQuestionRepository() {
		return questionRepository;
	}
	private QuestionRepository questionRepository;
	@Override
	public List<QuestionType> getQuestionTypes() {
		return questionRepository.getQuestionTypes();
	}

	@Override
	public List<Integer> getQuestionIds(String qtype) {
		return questionRepository.getQuestionIds(qtype);
	}

	@Override
	public Object[] getQuestion(String qtype, String qid) {
		List question = questionRepository.getQuestion(qtype, qid);
		return (Object[]) question.get(0);
	}

	@Override
	public QuestionCategory getQuestionCategory(String cid) {
		List category = questionRepository.getQuestionCategory(cid);
		return (QuestionCategory)category.get(0);
	}
}
