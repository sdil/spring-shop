package com.springshop.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

//    private final OrderService orderService;
    private final OrderRepository orderRepostory;

//    public OrderController(OrderService orderService, OrderRepository orderRepostory) {
    public OrderController(OrderRepository orderRepostory) {
//        this.orderService = orderService;
        this.orderRepostory = orderRepostory;
    }

    @GetMapping("/{userId}")
    public List<Order> getUserOrders(@PathVariable Long userId) {
        return this.orderRepostory.findByUserId(userId);
    }
}
