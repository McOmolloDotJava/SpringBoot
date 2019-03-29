package com.example.demo.MODELS;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="lms_parameters")
public class lms_parametersModel {

    private @Id
    @GeneratedValue
    Long PARAM_CODE;
    private String PARAM_NAME;

    public lms_parametersModel(String PARAM_NAME) {
        this.PARAM_NAME = PARAM_NAME;
    }

    public Long getPARAM_CODE() {
        return PARAM_CODE;
    }

    public void setPARAM_CODE(Long PARAM_CODE) {
        this.PARAM_CODE = PARAM_CODE;
    }

    public String getPARAM_NAME() {
        return PARAM_NAME;
    }

    public void setPARAM_NAME(String PARAM_NAME) {
        this.PARAM_NAME = PARAM_NAME;
    }
    private lms_parametersModel(){}
}
