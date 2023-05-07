package com.geekster.Ecommerce.services;

import com.geekster.Ecommerce.models.Product;
import com.geekster.Ecommerce.repository.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepo productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {// by request Param
        return productRepository.findByCategory(category);
    }


    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
