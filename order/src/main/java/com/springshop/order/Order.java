package com.springshop.order;

import jakarta.persistence.*;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long userId;

    protected Order() {}

    public Order(Long id, Long userId) {
        this.id = id;
        this.userId = userId;
    }
}
