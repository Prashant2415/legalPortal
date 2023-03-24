package com.portal.legalportal.model;


//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;

@Entity
public class Questions {
	@Id
	private int id;
	
	//@Column(name="question_username")
	private String question_username;
	
	//@Column(name="question_id")
	private String question;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(String question, String question_username) {
		super();
		this.question_username = question_username;
		this.question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestion_username() {
		return question_username;
	}
	public void setQuestion_username(String question_username) {
		this.question_username = question_username;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String toString() {
		return this.question + " - "+ this.question_username;
	}
}
