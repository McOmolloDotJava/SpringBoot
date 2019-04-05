package com.example.demo.SERVICE;

import com.example.demo.MODELS.Certificate;
import com.example.demo.MODELS.Employee;
import com.example.demo.REPOSITORY.CertificateRepo;
import com.example.demo.REPOSITORY.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    CertificateRepo certificateRepo;
    @PersistenceUnit
    private EntityManagerFactory emf;

    public Iterable<Employee> getEmployee(){
return employeeRepo.findAll();
    }

        public Iterable<Certificate> getCertificate(){
            return certificateRepo.findAll();
        }

    public Iterable<Employee> getcustomeQueryEmployee(){
        return employeeRepo.findcustomeQueryEmployee();
    }

    public Iterable<Certificate> getcustomeQueryCertificate(){
        return certificateRepo.findcustomeQueryCertificate();
    }
    public Iterable actionJoinTable() {
        EntityManager em = emf.createEntityManager();
        Iterable arr_cust = em
                .createQuery("SELECT e.id ,e.first_name,e.last_name," +
                        "c.certificate_name" +
                        " FROM Employee e " +
                        " LEFT JOIN " +
                        "Certificate c" +
                        " ON " +
                        "e.id=c.employee_id " +
                        " ")
                .getResultList();
        return arr_cust;
    }
}
