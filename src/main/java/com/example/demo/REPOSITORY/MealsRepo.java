package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.Meals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsRepo extends CrudRepository<Meals,Integer> {

}
