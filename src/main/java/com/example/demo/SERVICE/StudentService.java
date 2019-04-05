package com.example.demo.SERVICE;

import com.example.demo.MODELS.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
@Autowired
com.example.demo.REPOSITORY.studentRepo studentRepo;

@Autowired
com.example.demo.REPOSITORY.schoolfeeRepo schoolfeeRepo;


    public Iterable getStudent(){

        System.out.println("data ="+studentRepo.findAll());

        return Collections.singleton(studentRepo.findAllByStudentname("Jane"));
    }

    public Iterable getschooFee(){

        System.out.println("data ="+schoolfeeRepo.findAll());

        return schoolfeeRepo.findAllActiveUsersNative();
    }

    public Iterable studentCustomeQuery(){

        System.out.println("data ="+studentRepo.findAllActiveUsersNative(1));

        return Collections.singleton(studentRepo.findAllActiveUsersNative(1));
    }
}
