package com.shrikant.ecom.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shrikant.ecom.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContainingIgnoreCaseOrBrandContainingIgnoreCase (String name, String brand);
}
