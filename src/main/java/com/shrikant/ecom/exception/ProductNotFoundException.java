package com.shrikant.ecom.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(int id) {
        super("Product with ID " + id + " not found");
    }
}
