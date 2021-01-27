package com.project.java.katorzhin.projectonlinestore.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "purchase_item_table")
@Entity
@Data
public class PurchaseItemEntity extends BaseEntity {

    @Column
    private Integer count;


}
