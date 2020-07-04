package com.example.Service;

import java.util.List;

import com.example.Model.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> saveProducts(List<Product> product);
	
	public Product getproductByID(int id);
	
	public Product getproductByName(String name);
	
	public List<Product> getallproducts();

	void deleteProduct(int id);
	
	
}
