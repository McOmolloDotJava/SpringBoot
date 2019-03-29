package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.lms_parametersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Lms_parametersRepo extends CrudRepository<lms_parametersModel,Long> {
    Iterable<lms_parametersModel> findAll();
}
