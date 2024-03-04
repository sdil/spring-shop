package com.springshop.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private static final Logger log = LoggerFactory.getLogger(OrderApplication.class);


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getUserOrders(Long userId) {
        log.info("getUserOrders " + userId);
        return this.orderRepository.findByUserId(userId);
    }
}
