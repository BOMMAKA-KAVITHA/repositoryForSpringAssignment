package com.example.Flipkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.entity.CartItem;

@Repository
public interface CartItemtDaoInterface extends JpaRepository<CartItem, Integer>{

}
