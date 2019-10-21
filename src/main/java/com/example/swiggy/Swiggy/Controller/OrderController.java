package com.example.swiggy.Swiggy.Controller;

import com.example.swiggy.Swiggy.Entity.Order;
import com.example.swiggy.Swiggy.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping(method = RequestMethod.GET,value="/show")
    public List<Order> show()
    {
        return orderService.show();

    }

    @RequestMapping(method = RequestMethod.POST,value="/addOrder")
    public String add(@RequestBody Order order)
    {
        return orderService.add(order);
    }




}
