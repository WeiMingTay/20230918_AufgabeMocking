package com.example.productrepository.products.controller;

import com.example.productrepository.products.models.NewProduct;
import com.example.productrepository.products.models.Product;
import com.example.productrepository.products.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
      return productService.findAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody NewProduct newProduct){
        return productService.addProduct(newProduct);
    }

}
