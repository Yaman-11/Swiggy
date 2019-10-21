package com.example.swiggy.Swiggy.Service;


import com.example.swiggy.Swiggy.Entity.Food;
import com.example.swiggy.Swiggy.Repository.FoodRepository;
import com.example.swiggy.Swiggy.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;
    public List<Food> show() {
    List<Food> al=new ArrayList<>();
    for(Food f:foodRepository.findAll())
    {
        al.add(f);

    }
    return al;


    }

    public List<Food> find(int id)
    {
        List<Food> al=new ArrayList<>();
        for(Food f:foodRepository.findAll())
        {
            if(f.getRes()==id)
            {
                al.add(f);

            }
        }

        return al;


    }

    public String add(Food food)
    {
        foodRepository.save(food);
        return "ADDED SUCCESSFULLY";

    }



}
