package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Product;
import com.api.service.ProductService;

@RestController
@RequestMapping("/productApi")
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/add/{cid}")
	public String addProduct(@RequestBody Product product,@PathVariable Integer cid) {
		return service.addProduct(product,cid);
	}
	
	@GetMapping("/getProduct/{pid}")
	public Product getProductById(@PathVariable Integer pid) {
		return service.getProductById(pid);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@PutMapping("/update/{cid}")
	public Product updateProduct(@RequestBody Product product, @PathVariable Integer cid) {
		return service.updateProduct(product,cid);
	}
	
	@DeleteMapping("/delete/{pid}")
	public Product deleteProduct(@PathVariable Integer pid) {
		return service.deleteProduct(pid);
	}
}
