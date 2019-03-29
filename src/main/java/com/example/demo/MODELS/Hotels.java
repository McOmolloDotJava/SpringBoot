package com.example.demo.MODELS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="hotels")
public class Hotels {
    private @Id
    @GeneratedValue
    Long hotelid;
    private String name;

    @JsonIgnoreProperties(value = "hotels")
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "hotel_meals",
    joinColumns ={@JoinColumn(name = "hotelid")},
    inverseJoinColumns = {@JoinColumn(name = "mealid")})
    Set<Meals> meals= new HashSet<>();

    private Hotels(){}

    public Hotels(String name, Set<Meals> meals) {
        this.name = name;
        this.meals = meals;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Meals> getMeals() {
        return meals;
    }

    public void setMeals(Set<Meals> meals) {
        this.meals = meals;
    }
}
