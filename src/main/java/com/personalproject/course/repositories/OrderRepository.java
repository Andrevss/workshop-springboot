package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}


