package com.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.entity.Category;
import com.api.entity.Product;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory factory;
	
	public String addProduct(Product product, Integer cid) {
		Session session = factory.openSession();
		Category category = session.get(Category.class, cid);
		product.setCategory(category);
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		session.close();
		return "Product added successfully";
	}

	public Product getProductById(Integer pid) {
		Session session = factory.openSession();
		Product product = session.get(Product.class, pid);
		
		return product;
	}

	public List<Product> getAllProducts() {
		Session session = factory.openSession();
		return session.createCriteria(Product.class).list();
	}

	public Product updateProduct(Product product, Integer cid) {
		Session session = factory.openSession();
		Category category = session.get(Category.class, cid);
		product.setCategory(category);
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
		return product;
	}

	public Product deleteProduct(Integer pid) {
		Session session = factory.openSession();
		Product product = session.get(Product.class, pid);
		Transaction tr = session.beginTransaction();
		session.delete(product);
		tr.commit();
		return product;
	}

}
