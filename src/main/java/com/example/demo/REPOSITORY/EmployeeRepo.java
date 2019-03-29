package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}
