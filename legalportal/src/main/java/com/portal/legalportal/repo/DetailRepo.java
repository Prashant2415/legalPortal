package com.portal.legalportal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portal.legalportal.model.Details;

public interface DetailRepo extends JpaRepository<Details,Integer>{
	// List<Details> findByUsername(String username);
	@Query(value="Select * from Details where username= ?1",nativeQuery=true)
	public List<Details> findByUser(String username);
	

}
