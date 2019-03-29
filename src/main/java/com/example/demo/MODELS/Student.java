package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
@Table(name ="student")
public class Student {
    private @Id
    @GeneratedValue
    Long no;
    private String studentname;
    private int studentage ;
    private String studentgender;

    @JsonIgnoreProperties(value = "student")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feeid",referencedColumnName = "feebalid")
    private schoolfee schoolfee;

    private Student(){}
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender;
    }

    public com.example.demo.MODELS.schoolfee getSchoolfee() {
        return schoolfee;
    }

    public void setSchoolfee(com.example.demo.MODELS.schoolfee schoolfee) {
        this.schoolfee = schoolfee;
    }

    public Student(String studentname, int studentage, String studentgender, com.example.demo.MODELS.schoolfee schoolfee) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentgender = studentgender;
        this.schoolfee = schoolfee;
    }
}
