package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.CategoryDao;
import com.api.entity.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryDao dao;
	
	public String addCategory(Category category) {
		return dao.addCategory(category);
	}

	public Category getCategory(int cid) {
		return dao.getCategory(cid);
	}

	public List<Category> getAllCategory() {
		return dao.getAllCategory();
	}

	public Category updateCategory(Category category) {
		return dao.updateCategory(category);
	}

	public Category deleteCategory(Integer cid) {
		return dao.deleteCategory(cid);
	}

}
