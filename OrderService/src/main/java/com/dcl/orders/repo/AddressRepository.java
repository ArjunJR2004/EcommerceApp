package com.dcl.orders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.orders.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
