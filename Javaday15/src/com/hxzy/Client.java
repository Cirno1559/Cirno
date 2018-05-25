package com.hxzy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void add() {
		List<Product> product = new ArrayList<Product>();
		product.add(new Product("∂π∏…", 100, 2.0));
		product.add(new Product("º¶µ∞", 20, 1.2));
		product.add(new Product("≈£≈≈", 0, 35.0));
		product.add(new Product("¿œ∏…¬Ë", 25, 12.0));
		product.add(new Product("≈£ƒÃ", 30, 4.0));
	}
	public static void buy(ArrayList<Product> product) {
		try {
			Customer customer = new Customer("’≈»˝", 20, "º¶µ∞");
			for (Product product2 : product) {
				if(product2.getProductName().equals(customer.getBuyOfProduct())) {
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
