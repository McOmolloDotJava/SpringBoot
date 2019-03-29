package com.example.demo.CONTROLLER;

import com.example.demo.SERVICE.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class EmployeeContoller {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    @ResponseBody
    public Iterable employee() {
        System.out.println("data =---passing here ");

        return employeeService.getEmployee();
    }
    @RequestMapping(value = "/certificate", method = RequestMethod.GET)
    @ResponseBody
    public Iterable certificate() {

        System.out.println("data =---passing here ");

        return employeeService.getCertificate();
    }
}
