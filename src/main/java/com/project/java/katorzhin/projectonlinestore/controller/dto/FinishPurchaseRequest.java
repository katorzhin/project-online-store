package com.project.java.katorzhin.projectonlinestore.controller.dto;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Data
public class FinishPurchaseRequest {
    @NonNull
    private Map<Integer, Integer> productIdProductCount;
    @NotEmpty
    private String userName;
    private String userSurName;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String address;
    private String comment;
}
