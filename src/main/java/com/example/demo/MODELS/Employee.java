package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="employee")
public class Employee {
    private @Id
    @GeneratedValue
    Long id;
    private String first_name;
    private String last_name;
    private int salary;

    @JsonIgnoreProperties(value = "employee")
    @OneToMany(mappedBy = "employee")
    private Set<Certificate> certificates;

    public Employee(String first_name, String last_name, int salary, Set<Certificate> certificates) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.certificates = certificates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }
    private Employee(){}
}
