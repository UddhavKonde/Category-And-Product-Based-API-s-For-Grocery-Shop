package com.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Category {

	@Id
	@Column(name = "category_id")
	private int cid;
	@Column(name = "category_name")
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product> products;

	public Category() {
		super();
	}

	public Category(int cid, String name, List<Product> products) {
		super();
		this.cid = cid;
		this.name = name;
		this.products = products;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}




