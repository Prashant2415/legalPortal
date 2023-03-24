package com.portal.legalportal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.legalportal.model.Questions;
import com.portal.legalportal.service.QuestionService;

@RestController
@RequestMapping("/questions")
@CrossOrigin
public class QuestionController {

	// For question service
		@Autowired
		private QuestionService questionservice;
		@PostMapping("/addQuestion")
		public String addQuestion(@RequestBody Map<String, String> kvData)
		{
//			Map<String, String> kvData = JSON.parse(data);
			Questions quest = new Questions(kvData.get("question"), kvData.get("username"));
			System.out.println(quest.toString());
			Questions savedQuest = questionservice.saveQuestion(quest);
			if(savedQuest != null) {
				return "Question added";
			} 
			return "Failed to add question";
			
		}
		@GetMapping("/getQuestions")
		public List<Questions> getAllQuestions()
		{
			return questionservice.getAllQuestions();
		}
		
}

