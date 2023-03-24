package com.portal.legalportal.service;

import java.util.List;

import com.portal.legalportal.model.Questions;

public interface QuestionService {
	public Questions saveQuestion(Questions quest);
	public List<Questions> getAllQuestions();
}
