package com.springshop.order;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Orders")
@Data
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
