package com.geekster.Ecommerce.services;

import com.geekster.Ecommerce.models.Order;
import com.geekster.Ecommerce.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private IOrderRepo orderRepository;

    public void add(Order myorder) {
        orderRepository.save(myorder);
    }
    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }
}
