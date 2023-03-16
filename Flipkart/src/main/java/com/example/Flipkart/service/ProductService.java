package com.example.Flipkart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.dao.ProductDaoInterface;
import com.example.Flipkart.entity.FlipkartUser;
import com.example.Flipkart.entity.Products;

@Service
public class ProductService {
	
	@Autowired
	private ProductDaoInterface pdi;
	
	public Products addNewProduct(Products product) {
		return pdi.save(product);
		
	}

	public List<Products> getAllProducts() {
		return pdi.findAll();
	}

	public Products getProfileService(int productid) {
		Products pp=null;
		Optional<Products> oo=pdi.findById(productid);
		if(oo.isPresent()) {
		pp=oo.get();
	}
		return pp;
	}

}
