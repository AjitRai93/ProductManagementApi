package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.Model.Product;
import com.example.Service.ProductServiceImpl;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl product_service;
	
	
	@PostMapping("/saveProduct")
	@ApiOperation(value="Store a Single Product in Database.")
	public String saveProduct(@RequestBody Product product) {
		product_service.saveProduct(product);
		return "Product added Successfully";
		
	}
	
	@PostMapping("/saveProducts")
	@ApiOperation(value="Store Multiple Products in Database.")
	public List<Product> saveProducts(@RequestBody List<Product>products){
		return product_service.saveProducts(products);
		
	}
	
	@GetMapping("/getproductid/{id}")
	@ApiOperation(value="Find a product By its Id")
	public Product getproductByID(@PathVariable int id) {
		return product_service.getproductByID(id);
		
	}
	
	@GetMapping("/getproductname/{name}")
	@ApiOperation(value="Find a product By its Name")
	public Product getproductByID(@PathVariable String name) {
		return product_service.getproductByName(name);
		
	}
	
	@GetMapping("/getproducts")
	@ApiOperation(value="Find all the products present in database")
	public List<Product> findallproducts() {
		return product_service.getallproducts();
		
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value="Delete a product By its Id")
	public void delete(@PathVariable int id) {
		 product_service.deleteProduct(id);
	}
	

}
