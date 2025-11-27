package com.shrikant.ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
// @Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @Column(length = 2000)
    private String description;
    private String brand;
    @Min(1)
    private int price;



    // private LocalDate releaseDate;
    // private boolean available;
    // private int stockQuantity;
    // private String imageUrl;
    // private String sku;
    // private LocalDateTime createdAt;
    // private LocalDateTime updatedAt;
    // private boolean active;

    // optional future relationship
    // @ManyToOne
    // @JoinColumn(name = "category_id")
    // private Category category;

}
