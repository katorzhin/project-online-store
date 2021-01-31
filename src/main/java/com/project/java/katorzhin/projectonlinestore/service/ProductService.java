package com.project.java.katorzhin.projectonlinestore.service;

import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findById(Integer id);
}
