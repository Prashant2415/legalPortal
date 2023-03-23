package com.portal.legalportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.legalportal.model.Details;
import com.portal.legalportal.repo.DetailRepo;
@Service
public class DetailServiceImpl implements DetailService{

	@Autowired
	private DetailRepo detailrepo;
	
	@Override
	public Details saveDetail(Details detail) {
		return detailrepo.save(detail);
	}
	@Override
	public List<Details> getAll()
	{
		return detailrepo.findAll();
	}
	@Override
	public List<Details> getUsers(String username) {
		return (List<Details>) detailrepo.findByUser(username);
	}
	
	
}
