package com.luizbarauna.course.repositories;

import com.luizbarauna.course.entities.Category;
import com.luizbarauna.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
