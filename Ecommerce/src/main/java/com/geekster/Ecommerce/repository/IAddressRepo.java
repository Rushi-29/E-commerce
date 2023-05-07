package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address, Integer> {
}
