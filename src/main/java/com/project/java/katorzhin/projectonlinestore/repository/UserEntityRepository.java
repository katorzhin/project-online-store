package com.project.java.katorzhin.projectonlinestore.repository;

import com.project.java.katorzhin.projectonlinestore.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity findByEmail(String email);
}
