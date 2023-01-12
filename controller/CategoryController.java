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

import com.api.entity.Category;
import com.api.service.CategoryService;

@RestController
@RequestMapping("/categoryApi")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@PostMapping("/add")
	public String addCategory(@RequestBody Category category) {
		return service.addCategory(category);
	}
	
	@GetMapping("/getCategory/{cid}")
	public Category getCategory(@PathVariable Integer cid) {
		return service.getCategory(cid);
	}
	
	@GetMapping("/getAllCategory") 
	public List<Category> getAllCategory() 
	{
		return service.getAllCategory();
	}
	
	@PutMapping("/update")
	public Category updateCategory(@RequestBody Category category) {
		return service.updateCategory(category);
	}
	
	@DeleteMapping("/delete/{cid}")
	public Category deleteCategory(@PathVariable Integer cid) {
		return service.deleteCategory(cid);
	}
}
