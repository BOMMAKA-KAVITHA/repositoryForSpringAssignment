package com.example.Flipkart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartItem {
	@Id
	private Integer cartId;
	private Integer flipkartUserId;
	private Integer productId;
	private Integer quantity;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getFlipkartUserId() {
		return flipkartUserId;
	}
	public void setFlipkartUserId(Integer flipkartUserId) {
		this.flipkartUserId = flipkartUserId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
