package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="hotel_meals")
public class HotelMeals {
    private @Id
    @GeneratedValue
    Long refid;
    private double price;


    private HotelMeals(){}

    public HotelMeals(double price, Hotels hotels, Meals meals) {
        this.price = price;

    }

    public Long getRefid() {
        return refid;
    }

    public void setRefid(Long refid) {
        this.refid = refid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
