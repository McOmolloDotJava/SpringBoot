package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.lms_parametersModel;
import com.example.demo.MODELS.schoolfee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface schoolfeeRepo extends CrudRepository<schoolfee,Long> {
    Iterable<schoolfee> findAll();


    @Query(
            value = "SELECT * FROM schoolfee u  ",
            nativeQuery = true)
    Iterable <schoolfee> findAllActiveUsersNative();
}
