package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Certificate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepo extends CrudRepository<Certificate,Integer> {

}
