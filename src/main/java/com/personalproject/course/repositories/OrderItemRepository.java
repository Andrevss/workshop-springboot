package com.personalproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalproject.course.Entities.OrderItem;
import com.personalproject.course.Entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}


