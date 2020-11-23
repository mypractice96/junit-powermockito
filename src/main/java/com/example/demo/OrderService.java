package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

     @Autowired
     OrderDao dao;


    public int addOrder(Order order){
        System.out.println("Object = "+order);
        String res = Util.sayHello("hello");
        System.out.println("Res = "+res);
        return dao.addOrder(order);
    }
}
