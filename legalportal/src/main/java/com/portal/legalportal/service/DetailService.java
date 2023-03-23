package com.portal.legalportal.service;

import java.util.List;

import com.portal.legalportal.model.Details;

public interface DetailService {
	

	public Details saveDetail(Details detail);
	public List<Details> getAll();
	public List<Details> getUsers(String username);
	
}
