package com.assignment.session7;

public class ShoppingItem {
	private Product product;
	private int quantity;

	public ShoppingItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

// get and set methods not shown to save space 
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

}
