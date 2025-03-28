package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.models.Question;

public interface QuestionRepository extends MongoRepository<Question, Long> {

}
