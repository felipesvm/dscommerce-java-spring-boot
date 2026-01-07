package com.felipesvm.dscommerce.repositories;

import com.felipesvm.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
