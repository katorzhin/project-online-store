package com.project.java.katorzhin.projectonlinestore.controller;

import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;
import com.project.java.katorzhin.projectonlinestore.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity>getAllProduct(){
        log.info("handling get all products request");
        return productService.findAll();
    }
    @GetMapping("/product/{id}")
    public ProductEntity findById(@PathVariable Integer id){
        log.info("handling get product by id: {} ",id);
        return productService.findById(id);
    }
}
