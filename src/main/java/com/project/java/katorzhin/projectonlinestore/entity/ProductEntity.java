package com.project.java.katorzhin.projectonlinestore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Table(name = "product_table")
@Entity
@Data
public class ProductEntity extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String image;

    @Column
    private BigDecimal price;
}
