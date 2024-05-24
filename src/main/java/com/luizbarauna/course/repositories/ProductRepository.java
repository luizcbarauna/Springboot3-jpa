package com.luizbarauna.course.repositories;


import com.luizbarauna.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
