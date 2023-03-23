package com.portal.legalportal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.legalportal.model.Details;
import com.portal.legalportal.service.DetailService;

@RestController
@RequestMapping("/detail")
@CrossOrigin
public class DetailController {

	@Autowired
	private DetailService detailservice;
	@PostMapping("/add")
	public String add(@RequestBody Details detail) {
		System.out.println("details:"+detail.toString());
		detailservice.saveDetail(detail);
		return("New user added");
	}
	
	@GetMapping("/getAll")
	public List<Details> getAll()
	{
		return detailservice.getAll();	
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<Details> getUsername(@PathVariable String username) {
		System.out.println("username" +username);
		List<Details> users = detailservice.getUsers(username);
		if(users.isEmpty()) {
			return new ResponseEntity<Details>(new Details(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Details>(users.get(0),HttpStatus.OK);
	}
	

}
