package com.project.java.katorzhin.projectonlinestore.controller;

import com.project.java.katorzhin.projectonlinestore.controller.dto.FinishPurchaseRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class PurchaseController {
    @PostMapping("finishPurchase")
    public ResponseEntity finishPurchase(@Valid @RequestBody FinishPurchaseRequest request){
        log.info("handling finish purchase request: {}",request);
        return ResponseEntity.ok().build();
    }
}
