package com.bloomyzbotique.model;

public class CartItem {
	
	private int cartitemId;
	private Cart cart;
	private Product product;
	public int getCartitemId() {
		return cartitemId;
	}
	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
