package com.geekster.Ecommerce.services;

import com.geekster.Ecommerce.models.Address;
import com.geekster.Ecommerce.models.User;
import com.geekster.Ecommerce.repository.IAddressRepo;
import com.geekster.Ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

}
