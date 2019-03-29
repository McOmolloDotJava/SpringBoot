package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Hotels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepo extends CrudRepository<Hotels,Integer> {

}
