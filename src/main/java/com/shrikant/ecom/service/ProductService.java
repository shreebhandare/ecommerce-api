package com.shrikant.ecom.service;
import com.shrikant.ecom.entity.Product;
import com.shrikant.ecom.exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
    new Product(
        101,
        "Powerbank1",
        "50000 mAh powerbank with the 3 usb ports and one usb-c port.",
        "Duracell",
        5000
    ),
    new Product(
        102,
        "Powerbank2",
        "20000 mAh powerbank with the 3 usb ports and one usb-c port.",
        "Duracell",
        2000
    )));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream().filter(p->p.getId()==prodId).findFirst().orElseThrow(() -> new ProductNotFoundException(prodId));
    }

    public Product addProduct(Product prod){
        products.add(prod);
        return prod;
    }

    public Product updateProduct(Product prod) {
        int index = 0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getId() == (prod.getId()))
                index=i;            
            products.set(index, prod);        
        return prod;
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getId() == (prodId))
                index=i;
        products.remove(index);
    }

}
