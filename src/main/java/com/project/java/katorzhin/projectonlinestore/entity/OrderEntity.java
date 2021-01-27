package com.project.java.katorzhin.projectonlinestore.entity;

import lombok.Data;


import javax.persistence.*;

@Table(name = "order_table")
@Entity
@Data
public class OrderEntity extends BaseEntity {

    @Column
    private String Column;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "purchase_item_id")
    private PurchaseItemEntity purchaseItemEntity;

}
