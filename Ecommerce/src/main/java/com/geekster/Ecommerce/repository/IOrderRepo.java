package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.models.Address;
import com.geekster.Ecommerce.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order, Integer> {
}
