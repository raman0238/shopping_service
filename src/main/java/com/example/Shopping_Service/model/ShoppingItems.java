package com.example.Shopping_Service.model;

public class ShoppingItems {

	 private String name;
	 private String price;
	 private String quantity;
	 private String weight;
	 
	public ShoppingItems(String name, String price, String quantity, String weight) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
	}
	public ShoppingItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	 
}
