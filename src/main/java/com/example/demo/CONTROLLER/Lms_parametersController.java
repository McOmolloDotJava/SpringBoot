package com.example.demo.CONTROLLER;

import com.example.demo.SERVICE.Lms_parametersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Lms_parametersController {
    @Autowired
    Lms_parametersService lms_parametersService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public Iterable getAllParams() {
        System.out.println("data =---passing here ");

        return lms_parametersService.getAllParams();
    }
}