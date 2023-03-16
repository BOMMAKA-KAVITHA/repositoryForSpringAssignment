package com.example.Flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.entity.CartItem;
import com.example.Flipkart.entity.FlipkartUser;
import com.example.Flipkart.service.CartItemServiceInterface;
import com.example.Flipkart.service.FlipkartServiceInterface;

@RestController
public class CartItemController {
	
	@Autowired
	private CartItemServiceInterface csi;
	
	@PostMapping("cart")
	public CartItem cart(@RequestBody CartItem ci) {
		return csi.CartItemService(ci);
	}

}
