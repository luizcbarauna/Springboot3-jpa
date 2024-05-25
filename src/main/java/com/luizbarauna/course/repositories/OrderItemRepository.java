package com.luizbarauna.course.repositories;

import com.luizbarauna.course.entities.OrderItem;
import com.luizbarauna.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
