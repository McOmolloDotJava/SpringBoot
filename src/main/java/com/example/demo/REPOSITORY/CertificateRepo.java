package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Certificate;
import com.example.demo.MODELS.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepo extends CrudRepository<Certificate,Integer> {
    @Query(
            value = "SELECT * FROM certificate u ",
            nativeQuery = true)
    Iterable <Certificate> findcustomeQueryCertificate();
}
