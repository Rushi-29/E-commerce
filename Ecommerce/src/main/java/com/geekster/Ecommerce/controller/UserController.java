package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.models.Order;
import com.geekster.Ecommerce.models.Product;
import com.geekster.Ecommerce.models.User;
import com.geekster.Ecommerce.services.OrderService;
import com.geekster.Ecommerce.services.ProductService;
import com.geekster.Ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/Ecommerce")
public class UserController {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;


    @PostMapping(value = "/orders")
    public void createOrder(@RequestBody Order Myorder)
    {
        orderService.add(Myorder);
    }

    @GetMapping(value = "/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @GetMapping(value = "/users/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/products/path/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Integer id) {
        productService.deleteProductById(id);
    }


}
