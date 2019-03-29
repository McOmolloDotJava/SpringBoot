package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="certificate")
public class Certificate {
    private @Id
    @GeneratedValue
    Long id;
    private String certificate_name;

    @JsonIgnoreProperties(value = "certificate")
@ManyToOne
@JoinColumn(name = "employee_id",nullable = false)
private Employee employee;


    private Certificate(){}

    public Certificate(String certificate_name, Employee employee) {
        this.certificate_name = certificate_name;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificate_name() {
        return certificate_name;
    }

    public void setCertificate_name(String certificate_name) {
        this.certificate_name = certificate_name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
