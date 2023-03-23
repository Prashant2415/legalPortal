package com.portal.legalportal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
	@Id
	
	private int id;
	private String username;
	private String question;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(String question, String username) {
		super();
		this.username = username;
		this.question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
