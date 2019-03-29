package com.example.demo.CONTROLLER;

import com.example.demo.SERVICE.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HotelsController {
@Autowired
    HotelsService hotelsService;

    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    @ResponseBody
    public Iterable hotels() {
        System.out.println("data =---passing here ");

        return hotelsService.getHotels();
    }
    @RequestMapping(value = "/meals", method = RequestMethod.GET)
    @ResponseBody
    public Iterable meals() {

        System.out.println("data =---passing here ");

        return hotelsService.getMeals();
    }
    @RequestMapping(value = "/hotelMeals", method = RequestMethod.GET)
    @ResponseBody
    public Iterable hotelMeals() {

        System.out.println("data =---passing here ");

        return hotelsService.getHotelMeals();
    }
}
