package com.portal.legalportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.legalportal.model.Questions;
import com.portal.legalportal.repo.QuestionRepo;
@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionRepo questionrepo;
	@Override
	public Questions saveQuestion(Questions quest)
	{
		return questionrepo.save(quest);
	}
	
}
