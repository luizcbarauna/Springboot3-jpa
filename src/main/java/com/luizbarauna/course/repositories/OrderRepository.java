package com.luizbarauna.course.repositories;

import com.luizbarauna.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
