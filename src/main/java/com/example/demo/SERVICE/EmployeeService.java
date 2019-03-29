package com.example.demo.SERVICE;

import com.example.demo.MODELS.Certificate;
import com.example.demo.MODELS.Employee;
import com.example.demo.REPOSITORY.CertificateRepo;
import com.example.demo.REPOSITORY.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    CertificateRepo certificateRepo;

    public Iterable<Employee> getEmployee(){
return employeeRepo.findAll();
    }

        public Iterable<Certificate> getCertificate(){
            return certificateRepo.findAll();
        }
}
