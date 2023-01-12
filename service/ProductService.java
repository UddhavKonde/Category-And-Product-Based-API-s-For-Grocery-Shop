package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.ProductDao;
import com.api.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	
	public String addProduct(Product product, Integer cid) {
		return dao.addProduct(product,cid);
	}

	public Product getProductById(Integer pid) {
		return dao.getProductById(pid);
	}

	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

	public Product updateProduct(Product product, Integer cid) {
		return dao.updateProduct(product,cid);
	}

	public Product deleteProduct(Integer pid) {
		return dao.deleteProduct(pid);
	}

}
