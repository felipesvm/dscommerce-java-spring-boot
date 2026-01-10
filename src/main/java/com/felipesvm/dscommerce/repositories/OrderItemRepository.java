package com.felipesvm.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipesvm.dscommerce.entities.OrderItem;
import com.felipesvm.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
