package com.portal.legalportal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.portal.legalportal.model.Questions;

public interface QuestionRepo extends JpaRepository<Questions,Integer>{
	//@Query(value="Select * from Questions",nativeQuery=true)
	//public List<Questions> getAllQuestions();
}
