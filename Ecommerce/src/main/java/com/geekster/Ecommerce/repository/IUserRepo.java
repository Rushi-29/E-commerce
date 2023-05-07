package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.models.Address;
import com.geekster.Ecommerce.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {


}
