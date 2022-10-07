package com.knf.dev.controllers;
import com.knf.dev.models.Cart;
import com.knf.dev.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

@Autowired
    private CartRepository cartRepository;
    public List<Cart> getProductsList(){
        return cartRepository.findAll();
    }

    public Cart addToCart(Cart entry){
        return cartRepository.save(entry);
    }
}