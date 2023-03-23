package com.portal.legalportal.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class QnA {
	@Id
	private int id;
	private String question;
	private List<Answer> answer; 
	private int rating;
	private boolean isResolved;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
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
	public QnA(int id, String question, List<Answer> answer, int rating, boolean isResolved) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.rating = rating;
		this.isResolved = isResolved;
	}
	public QnA() {
		super();
		// TODO Auto-generated constructor stub
	}
}
