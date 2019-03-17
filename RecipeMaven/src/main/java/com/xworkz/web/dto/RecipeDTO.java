package com.xworkz.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "recipe")
public class RecipeDTO implements Serializable {

	@Id
	@GenericGenerator(name = "rec", strategy = "increment")
	@GeneratedValue(generator = "rec")
	@Column(name = "R_id")
	private int id;
	@Column(name = "R_name")
	private String name;
	@Column(name = "R_types")
	private String types;
	@Column(name = "R_price")
	private int price;

	public RecipeDTO() {
		System.out.println("created........." + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "RecipeDTO [id=" + id + ", name=" + name + ", types=" + types + ", price=" + price + "]";
	}

}
