package com.example.demo;

public class OrderDao {

    public int addOrder(Order order){
        if(order.getName() != null)
            return 1;
        else
            return 0;
    }
}
