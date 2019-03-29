package com.example.demo.SERVICE;

import com.example.demo.MODELS.HotelMeals;
import com.example.demo.MODELS.Hotels;
import com.example.demo.MODELS.Meals;
import com.example.demo.REPOSITORY.HotelsMealsRepo;
import com.example.demo.REPOSITORY.HotelsRepo;
import com.example.demo.REPOSITORY.MealsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelsService {
    @Autowired
    HotelsRepo hotelsRepo;
    @Autowired
    MealsRepo mealsRepo;
    @Autowired
    HotelsMealsRepo hotelsMealsRepo;

    public Iterable<Hotels> getHotels(){
        return hotelsRepo.findAll();
    }

    public Iterable<Meals> getMeals(){
        return mealsRepo.findAll();
    }
    public Iterable<HotelMeals> getHotelMeals(){
        return hotelsMealsRepo.findAll();
    }
}
