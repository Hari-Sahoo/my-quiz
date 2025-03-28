package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.models.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    public Employee findByEmail(String email);

    public List<Employee> findByRole(String role);

    public Boolean existsByEmail(String email);

}
