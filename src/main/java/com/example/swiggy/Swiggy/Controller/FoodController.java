package com.example.swiggy.Swiggy.Controller;


import com.example.swiggy.Swiggy.Entity.Food;
import com.example.swiggy.Swiggy.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;
    @RequestMapping(method = RequestMethod.GET,value="/showAll")
    public List<Food> show()
    {
        return foodService.show();

    }

    @RequestMapping(method = RequestMethod.GET,value="/resShow/{id}")
    public List<Food> find(@PathVariable int id)
    {
        return foodService.find(id);

    }
    @RequestMapping(method = RequestMethod.POST,value="/add")
    public String add(@RequestBody Food food)
    {
       return  foodService.add(food);

    }


}
