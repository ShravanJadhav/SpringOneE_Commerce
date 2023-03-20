package com.acciojob.SpringOneE_Commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Service service;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        service.addUser(user);
        return "User added...!";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        service.addProdcut(product);
        return "Product added..!";
    }


    @PostMapping("/createOrder")
    public String createOrder(@RequestParam String userId) throws Exception {
        service.createOrder(userId);

        return "created order with start from 'A'";
    }

    @GetMapping("/maxPrice")
    public Product maxPriceProduct(){
        return service.maxPriceProduct();
    }

    @GetMapping("/mostOrderProduct")
    public Product mostOrderProduct(){
        return service.mostOrderProduct();
    }
}
