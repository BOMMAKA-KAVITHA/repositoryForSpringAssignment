package com.example.Flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.entity.FlipkartUser;
import com.example.Flipkart.entity.Products;
import com.example.Flipkart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService ps; 
	
	@PostMapping("addNewProduct")
	public Products addNewProduct(@RequestBody Products product) {
		return ps.addNewProduct(product);
	}
	@GetMapping("viewAllProducts")
	public List<Products> product(){
		return ps.getAllProducts();
	}
	
	@GetMapping("viewProduct/{id}")
	public Products viewProduct(@PathVariable("id") int productid) {
		return ps.getProfileService(productid);
	}
}