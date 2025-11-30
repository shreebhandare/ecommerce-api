package com.shrikant.ecom.service;
import com.shrikant.ecom.entity.Product;
import com.shrikant.ecom.exception.ProductNotFoundException;
import com.shrikant.ecom.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElseThrow(() -> new ProductNotFoundException(prodId));
    }

    public Product addProduct(Product prod){
        repo.save(prod);
        return prod;
    }

    public Product updateProduct(Product prod) {
        repo.save(prod);   
        return prod;
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public List<Product> getProductsByName(String keyword){
        if (keyword == null || keyword.trim().isEmpty()) {
            return new ArrayList<>();
        }
        return repo.findByNameContainingIgnoreCaseOrBrandContainingIgnoreCase(keyword,keyword);
    }

}
