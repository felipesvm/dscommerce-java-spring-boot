package com.felipesvm.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesvm.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
