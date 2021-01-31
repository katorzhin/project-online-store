package com.project.java.katorzhin.projectonlinestore.repository;

import com.project.java.katorzhin.projectonlinestore.entity.PurchaseItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseEntityRepository extends JpaRepository<PurchaseItemEntity,Integer> {
}
