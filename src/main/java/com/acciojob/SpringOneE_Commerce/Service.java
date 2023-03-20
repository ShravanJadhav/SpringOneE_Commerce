package com.acciojob.SpringOneE_Commerce;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
    public void addUser(User user) {
        repository.addUser(user);
    }

    public void addProdcut(Product product) {
        repository.addProduct(product);
    }

    public void createOrder(String userId) throws Exception {
        repository.createOrder(userId);
    }

    public Product maxPriceProduct() {
        return repository.maxPriceProduct();
    }

    public Product mostOrderProduct() {
        return repository.mostOrderProduct();
    }
}
