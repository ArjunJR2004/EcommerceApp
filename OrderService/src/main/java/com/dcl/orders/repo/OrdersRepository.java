package com.dcl.orders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.orders.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
