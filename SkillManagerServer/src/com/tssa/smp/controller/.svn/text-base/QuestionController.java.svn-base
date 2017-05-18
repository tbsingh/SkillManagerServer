package com.tssa.smp.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tssa.smp.domain.hibernate.QuestionExt;
import com.tssa.smp.domain.hibernate.QuestionType;
import com.tssa.smp.domain.service.QuestionService;
import com.tssa.smp.domain.hibernate.QuestionCategory;
import com.tssa.smp.util.QType;
import com.tssa.smp.util.Utility;


@RestController
public class QuestionController {
	
	 private QuestionService questionService;
	 public void setQuestionService(QuestionService service) {
		 this.questionService=service;
	 }
	 @RequestMapping(value="/help",method = RequestMethod.GET,headers="Accept=text/html")
	 public String help() throws ParseException {	
		 StringBuilder help = new StringBuilder();
		 help.append("<h2>Skill Management Platform RESTful URI</h2>");
		 help.append("<ul>");
		 help.append("<li>Get questions list - /questions</li>");
		 help.append("<li>Get question category list- /categories</li>");
		 help.append("<li>Get subject list - /subjects</li>");
		 help.append("<li>Get a category  information by id - /categories/ids/{id}</li>");
		 help.append("<li>Get all Question IDs for a subject - /subjects/{qtype}/questions/ids</li>");
		 help.append("<li>Get a question information by id - /subjects/{qtype}/questions/ids/{id}</li>");
		 help.append("</ul>");
		 help.append("<h4>The {name} can be any one of java, cpp, db, os, design</h4>");
		 return help.toString();		 
	 }
	 
	 @RequestMapping(value="/questions",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<QuestionExt> getAllQuestions() {	 
	  List<QuestionExt> questions=questionService.getAllQuestions();
	  return questions;
	
	 }
	 
	 @RequestMapping(value="/categories",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<QuestionCategory> getQuestionCategories(){
			return questionService.getQuestionCategories();
	 }
	 
	 @RequestMapping(value="/categories/ids/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	 public QuestionCategory getQuestionCategory(@PathVariable String id){
		 QuestionCategory category = questionService.getQuestionCategory(id);
		 return category;
	 }
	 
	 @RequestMapping(value="/subjects",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<QuestionType> getQuestionTypes(){
			return questionService.getQuestionTypes();
	 }
	
	 @RequestMapping(value="/subjects/{name}/questions/ids",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<Integer> getQuestionIds(@PathVariable String name){
		 return questionService.getQuestionIds(name);
	 }
	 
	 @RequestMapping(value="/subjects/{name}/questions/ids/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	 public QuestionExt getQuestion(@PathVariable String name, @PathVariable String id){
		 Object[] questionInfo = questionService.getQuestion(name,id);
		 QuestionExt question = (QuestionExt)questionInfo[0];
		 return question;
	 }
	 
	 @RequestMapping(value="/subjects/{name}/questions/ids/{id}/text",method = RequestMethod.GET,headers="Accept=text/html")
	 public String getQuestionText(@PathVariable String name, @PathVariable String id){
		 Object[] questionInfo = questionService.getQuestion(name,id);
		 QuestionExt question = (QuestionExt)questionInfo[0];
		 return "<p>"+Utility.preserveFormating(question.getText())+"</p>";
	 }
}