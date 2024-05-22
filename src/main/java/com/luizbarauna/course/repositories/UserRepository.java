package com.luizbarauna.course.repositories;

import com.luizbarauna.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
