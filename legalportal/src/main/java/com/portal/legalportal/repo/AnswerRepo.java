package com.portal.legalportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.legalportal.model.Answer;
@Repository
public interface AnswerRepo extends JpaRepository<Answer,Integer>{

}
