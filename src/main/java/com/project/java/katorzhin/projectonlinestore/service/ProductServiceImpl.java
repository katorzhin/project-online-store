package com.project.java.katorzhin.projectonlinestore.service;

import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;
import com.project.java.katorzhin.projectonlinestore.exception.NotFoundException;
import com.project.java.katorzhin.projectonlinestore.repository.ProductEntityRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public List<ProductEntity> findAll() {
        return productEntityRepository.findAll();
    }

    @Override
    @SneakyThrows
    public ProductEntity findById(Integer id) {
        return productEntityRepository.findById(id)
                .orElseThrow(()->new NotFoundException("Product not found"));
    }
}
