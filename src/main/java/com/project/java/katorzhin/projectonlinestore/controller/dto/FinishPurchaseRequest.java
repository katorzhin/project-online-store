package com.project.java.katorzhin.projectonlinestore.controller.dto;

import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@ToString(exclude = "password")
public class FinishPurchaseRequest {

    @NotNull
    private List<ProductEntity> products;

    @NotEmpty
    private String userName;

    private String userSurName;

    @NotEmpty
    private String email;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String address;

    private String password;

    private String comment;

}
