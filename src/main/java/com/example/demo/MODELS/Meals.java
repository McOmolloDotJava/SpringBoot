package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name ="meals")
public class Meals {
    private @Id
    @GeneratedValue
    Long mealid;
    private String name;

    @JsonIgnoreProperties(value = "meals")
    @ManyToMany(mappedBy = "meals")
    private Set<Hotels> hotelMeals=new HashSet<>();

    private Meals() { }

    public Meals(String name, Set<Hotels> hotelMeals) {
        this.name = name;
        this.hotelMeals = hotelMeals;
    }

    public Long getMealid() {
        return mealid;
    }

    public void setMealid(Long mealid) {
        this.mealid = mealid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Hotels> getHotelMeals() {
        return hotelMeals;
    }

    public void setHotelMeals(Set<Hotels> hotelMeals) {
        this.hotelMeals = hotelMeals;
    }
}


