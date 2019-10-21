package com.example.swiggy.Swiggy.Service;

import com.example.swiggy.Swiggy.Entity.Food;
import com.example.swiggy.Swiggy.Entity.Order;
import com.example.swiggy.Swiggy.Repository.FoodRepository;
import com.example.swiggy.Swiggy.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private FoodRepository foodRepository;
    public String add(Order order)
    {
        orderRepository.save(order);
        for(Food f:foodRepository.findAll())
        {
            if(f.getRes()==order.getRes() && f.getFood().equals(order.getFood()))
            {
                f.setQuantity(f.getQuantity()-order.getQuantity());
                foodRepository.save(f);

            }
        }
        return "ADDED SUCCESSFULLY";


    }

    public List<Order> show()
    {
        List<Order> al=new ArrayList<>();

        for(Order o: orderRepository.findAll())
        {
            al.add(o);


        }
        return al;


    }
}
