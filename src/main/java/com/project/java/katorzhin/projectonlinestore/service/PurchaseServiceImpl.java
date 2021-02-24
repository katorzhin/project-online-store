package com.project.java.katorzhin.projectonlinestore.service;

import com.project.java.katorzhin.projectonlinestore.controller.dto.FinishPurchaseRequest;
import com.project.java.katorzhin.projectonlinestore.entity.OrderEntity;
import com.project.java.katorzhin.projectonlinestore.entity.ProductEntity;
import com.project.java.katorzhin.projectonlinestore.entity.PurchaseItemEntity;
import com.project.java.katorzhin.projectonlinestore.repository.OrderEntityRepository;
import com.project.java.katorzhin.projectonlinestore.repository.PurchaseEntityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class PurchaseServiceImpl implements PurchaseService {

    private final ProductService productService;
    private final UserService userService;
    private final OrderEntityRepository orderEntityRepository;
    private final PurchaseEntityRepository purchaseEntityRepository;

    @Override
    public Integer finishPurchase(FinishPurchaseRequest request) {
        log.info("creating order entity from request: {}", request);
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserEntity(userService.findOrCreateUser(request.getUserName(), request.getUserSurName(),
                request.getPhone(), request.getEmail(),
                request.getAddress()));
        orderEntity.setComment(request.getComment());
        orderEntity = orderEntityRepository.save(orderEntity);
        Map<Integer, Integer> productIdProductCount = getProductIdProductCountMap(request);

        for (Map.Entry<Integer, Integer> entry : productIdProductCount.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            ProductEntity productEntity = productService.findById(k);
            PurchaseItemEntity purchaseItemEntity = new PurchaseItemEntity();
            purchaseItemEntity.setProductEntity(productEntity);
            purchaseItemEntity.setCount(v);
            purchaseItemEntity.setOrderEntity(orderEntity);
            purchaseEntityRepository.save(purchaseItemEntity);
        }
        return orderEntity.getId();
    }

    private Map<Integer, Integer> getProductIdProductCountMap(FinishPurchaseRequest request) {
        Map<Integer, Integer> productIdProductCount = new HashMap<>();
        request.getProductIds().forEach(it->{
            if (productIdProductCount.containsKey(it)){
                Integer productCount = productIdProductCount.get(it);
                productCount = productCount+1;
                productIdProductCount.put(it,productCount);
            }else {
                productIdProductCount.put(it,1);
            }
        });
        return productIdProductCount;
    }
}
