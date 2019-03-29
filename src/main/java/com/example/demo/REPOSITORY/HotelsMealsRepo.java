package com.example.demo.REPOSITORY;

import com.example.demo.MODELS.HotelMeals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsMealsRepo extends CrudRepository<HotelMeals,Integer> {
}
