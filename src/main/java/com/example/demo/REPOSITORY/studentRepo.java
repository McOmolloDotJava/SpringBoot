package com.example.demo.REPOSITORY;


import com.example.demo.MODELS.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface studentRepo extends CrudRepository<Student,Integer> {
    Iterable<Student> findAll();
    Student findAllByNo(int no);
    Student findAllByStudentname(String name);


    @Query(
            value = "SELECT * FROM student u WHERE u.feeid=:feeid",
            nativeQuery = true)
    Iterable <Student> findAllActiveUsersNative( @Param("feeid") Integer feeid);
}

