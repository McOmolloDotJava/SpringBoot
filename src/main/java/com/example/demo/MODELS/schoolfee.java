package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name ="schoolfee")
public class schoolfee {
    private @Id
    @GeneratedValue
    Long feebalid;
    private int refID;
    private double paid;
    private double balance;
    private int studentid;

    @JsonIgnoreProperties(value = "schoolfee")
    @OneToOne(mappedBy = "schoolfee")
    private Student student;

    public schoolfee(int refID, double paid, double balance, int studentid, Student student) {
        this.refID = refID;
        this.paid = paid;
        this.balance = balance;
        this.studentid = studentid;
        this.student = student;
    }

    private schoolfee(){}
    public Long getFeebalid() {
        return feebalid;
    }

    public void setFeebalid(Long feebalid) {
        this.feebalid = feebalid;
    }

    public int getRefID() {
        return refID;
    }

    public void setRefID(int refID) {
        this.refID = refID;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
