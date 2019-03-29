package com.example.demo.REPOSITORY;


import com.example.demo.MODELS.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends CrudRepository<Student,Integer> {
    Iterable<Student> findAll();
    Student findAllByNo(int no);
    Student findAllByStudentname(String name);
}

