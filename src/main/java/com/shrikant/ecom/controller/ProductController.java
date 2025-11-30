package com.shrikant.ecom.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.shrikant.ecom.entity.Product;
import com.shrikant.ecom.service.ProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired    
    private ProductService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/{prodId}")    
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product prod){        
        Product saved = service.addProduct(prod);
        return ResponseEntity.created(URI.create("/products/" + saved.getId())).body(saved);
    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(@Valid @RequestBody Product prod){
        Product updated =service.updateProduct(prod);
        return ResponseEntity.created(URI.create("/products/" + updated.getId())).body(updated);
    }

    @DeleteMapping("/{prodId}")    
    public ResponseEntity<Void> deleteProduct(@PathVariable int prodId){        
        service.deleteProduct(prodId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Product> getProductsByName(@RequestParam(required = false) String keyword){
        return service.getProductsByName(keyword.trim());
    }
}
