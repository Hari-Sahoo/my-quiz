package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.models.Answer;

public interface AnswerRepository extends MongoRepository<Answer, Long> {

//	List<Answer> findByRollNo(int rollNo);
	

}
