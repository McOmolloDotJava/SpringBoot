package com.example.demo.SERVICE;

import com.example.demo.REPOSITORY.Lms_parametersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class Lms_parametersService {
@Autowired
  Lms_parametersRepo lms_parametersRepo;

public Iterable getAllParams(){

System.out.println("data ="+lms_parametersRepo.findAll());

  return lms_parametersRepo.findAll();
}
}
