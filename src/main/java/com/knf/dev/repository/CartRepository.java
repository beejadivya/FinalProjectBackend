package com.knf.dev.repository;
import com.knf.dev.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CartRepository extends JpaRepository<Cart,Long> {
}
