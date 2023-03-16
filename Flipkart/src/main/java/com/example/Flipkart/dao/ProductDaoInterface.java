package com.example.Flipkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.entity.Products;

@Repository
public interface ProductDaoInterface extends JpaRepository<Products, Integer>{

}
