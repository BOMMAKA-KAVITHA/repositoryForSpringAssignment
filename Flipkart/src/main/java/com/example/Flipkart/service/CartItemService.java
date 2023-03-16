package com.example.Flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.dao.CartItemtDaoInterface;
import com.example.Flipkart.dao.FlipkartDaoInterface;
import com.example.Flipkart.entity.CartItem;

@Service
public class CartItemService implements CartItemServiceInterface{
	
	@Autowired
	private CartItemtDaoInterface cidi;


	@Override
	public CartItem CartItemService(CartItem ci) {
		
		return cidi.save(ci);
	}
	
	

}
