package com.example.demo.CONTROLLER;

import com.example.demo.SERVICE.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HotelsController {
@Autowired
    HotelsService hotelsService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody String data) {

        System.out.println("login------ "+data);

        return "1";
    }
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
