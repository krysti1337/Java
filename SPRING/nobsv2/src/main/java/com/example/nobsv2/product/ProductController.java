package com.example.nobsv2.product;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @PostMapping
    public String createProduct(){
        return "Product Create";
    }

    @GetMapping
    public String getProduct(){
        return "Get Product";
    }

    @PutMapping
    public String putProduct(){
        return "Update product";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "Delete product";
    }
}
