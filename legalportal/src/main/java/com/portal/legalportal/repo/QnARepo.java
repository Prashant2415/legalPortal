package com.portal.legalportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.legalportal.model.QnA;
@Repository
public interface QnARepo extends JpaRepository<QnA,Integer>{

}
