package com.jspiders.roxilertask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	private boolean sold;
	private String dateOfSale;
	public String getDateOfSale() {
		// TODO Auto-generated method stub
		return this.dateOfSale;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isSold() {
		// TODO Auto-generated method stub
		return this.sold;
	}
}
//	public List<Product> getDateOfSale() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getCategory() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public double getPrice() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public boolean isSold() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	public Integer getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public double getPrice() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public boolean isSold() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	public List<Product> getDateOfSale() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public Object getCategory() {
//		// TODO Auto-generated method stub
//		return null;



