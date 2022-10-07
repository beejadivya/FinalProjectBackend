package com.knf.dev.controllers;
import com.knf.dev.models.Cart;
import com.knf.dev.controllers.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
//@CrossOrigin(origins="*")
@CrossOrigin(origins = "*", maxAge = 4800)
@RequestMapping("api/auth")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping("/cart")
    public List<Cart> list(){
        return cartService.getProductsList();
    }
    @PostMapping("/add_product")
    public Cart addProduct(@RequestBody Cart entry){
        return cartService.addToCart(entry);
    }


}
