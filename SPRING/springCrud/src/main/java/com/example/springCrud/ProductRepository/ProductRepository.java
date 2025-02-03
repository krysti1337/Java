package com.example.springCrud.ProductRepository;

import com.example.springCrud.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
