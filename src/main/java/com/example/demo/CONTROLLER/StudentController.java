package com.example.demo.CONTROLLER;

import com.example.demo.SERVICE.Lms_parametersService;
import com.example.demo.SERVICE.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    @ResponseBody
    public Iterable getStudents() {
        System.out.println("data =---passing here ");

        return studentService.getStudent();
    }
    @RequestMapping(value = "/feeBalance", method = RequestMethod.GET)
    @ResponseBody
    public Iterable getFeeBalances() {
        System.out.println("data =---passing here ");

        return studentService.getschooFee();
    }
}
