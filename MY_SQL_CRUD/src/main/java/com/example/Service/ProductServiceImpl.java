package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Product;
import com.example.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	
	@Override
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		return repo.saveAll(products);
	}

	@Override
	public Product getproductByID(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Product getproductByName(String name) {
		return repo.findByName(name).orElse(null);
	}

	@Override
	public List<Product> getallproducts() {
		return repo.findAll();
	}

	@Override
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

	


}
