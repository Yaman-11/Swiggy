package com.example.swiggy.Swiggy.Repository;

import com.example.swiggy.Swiggy.Entity.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<Food,Integer> {


}
