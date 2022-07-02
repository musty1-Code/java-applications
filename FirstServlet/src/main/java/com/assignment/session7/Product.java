package com.assignment.session7;

public class Product {
private int id; private String name;
private String description; private float price;
public Product(int id, String name, String description, float price) {
this.id = id;
this.name = name; this.description = description; this.price = price;
}
// get and set methods not shown to save space
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getDescription() {
	return description;
}
public float getPrice() {
	return price;
}

}

