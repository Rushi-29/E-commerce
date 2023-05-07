package com.geekster.Ecommerce.services;

import com.geekster.Ecommerce.models.User;
import com.geekster.Ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepository;


    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }
}
