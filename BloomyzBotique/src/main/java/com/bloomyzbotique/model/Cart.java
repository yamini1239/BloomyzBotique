package com.bloomyzbotique.model;

import java.util.List;

public class Cart {
	private int cartId;
	private List<CartItem> cartitems;
	private String Product;
	private int Price;
	private double totalprice;
	private Billingaddress billingaddress;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<CartItem> getCartitems() {
		return cartitems;
	}
	public void setCartitems(List<CartItem> cartitems) {
		this.cartitems = cartitems;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public Billingaddress getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(Billingaddress billingaddress) {
		this.billingaddress = billingaddress;
	}
	
	
	
	

}
