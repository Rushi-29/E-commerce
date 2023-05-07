package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.models.Address;
import com.geekster.Ecommerce.models.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findByCategory(String category);

}
