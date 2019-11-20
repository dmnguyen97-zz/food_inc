package com.excella.foodinc.controller;

import com.excella.foodinc.object.Food;
import com.excella.foodinc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(value="/nutrition")
    public Food retrieveFood(@RequestParam(value="name", required=false) String name) {
        foodService.initialize();
        return foodService.getFood(name);
    }


}
