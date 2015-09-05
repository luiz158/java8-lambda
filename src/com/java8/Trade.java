package com.java8;

public class Trade {

	private Integer quantity;
	
	private String name;

	public Trade(Integer quantity, String name) {
		this.quantity = quantity;
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
