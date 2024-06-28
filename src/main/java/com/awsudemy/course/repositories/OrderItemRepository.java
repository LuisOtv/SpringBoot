package com.awsudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awsudemy.course.entities.OrderItem;
import com.awsudemy.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
