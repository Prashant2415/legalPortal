package com.portal.legalportal.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class QnA {
	@Id
	private int id;
	private String qna_question;
	//private List<Answer> qna_answer; 
	private int rating;
	private boolean isResolved;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQna_question() {
		return qna_question;
	}
	public void setQna_question(String qna_question) {
		this.qna_question = qna_question;
	}
//	public List<Answer> getQna_answer() {
//		return qna_answer;
//	}
//	public void setQna_answer(List<Answer> qna_answer) {
//		this.qna_answer = qna_answer;
//	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public boolean isResolved() {
		return isResolved;
	}
	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	public QnA(int id, String qna_question, int rating, boolean isResolved) {
		super();
		this.id = id;
		this.qna_question = qna_question;
		//this.qna_answer = qna_answer;
		this.rating = rating;
		this.isResolved = isResolved;
	}
	public QnA() {
		super();
		// TODO Auto-generated constructor stub
	}
}
