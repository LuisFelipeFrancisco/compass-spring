package com.compass.course.repositories;

import com.compass.course.entities.Order;
import com.compass.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
