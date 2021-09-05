package com.example.digitalinnovationone.shoppingcart.repository;


import com.example.digitalinnovationone.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}