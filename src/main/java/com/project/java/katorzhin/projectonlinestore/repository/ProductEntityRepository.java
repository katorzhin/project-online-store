package com.project.java.katorzhin.projectonlinestore.repository;

import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<ProductEntity,Integer> {
}
