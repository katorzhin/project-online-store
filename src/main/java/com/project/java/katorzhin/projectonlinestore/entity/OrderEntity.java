package com.project.java.katorzhin.projectonlinestore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Table(name = "order_table")
@Entity
@Data
public class OrderEntity extends BaseEntity {

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;


}
