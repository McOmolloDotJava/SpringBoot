package com.example.demo;

import com.example.demo.CONTROLLER.Lms_parametersController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.REPOSITORY"})
@ComponentScan(basePackageClasses= Lms_parametersController.class)
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        System.out.println("------- start-------boot -----");
    }
}
