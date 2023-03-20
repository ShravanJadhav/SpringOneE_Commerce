package com.acciojob.SpringOneE_Commerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {
    Map<String,User> userMap;
    Map<String,Product>productMap;
    Map<String, List<Order>>orderMap;

    public Repository(){
        userMap=new HashMap<>();
        productMap= new HashMap<>();
        orderMap = new HashMap<>();
    }
    public void addUser(User user) {
        userMap.put(user.getUserId(),user);
    }

    public void addProduct(Product product) {
       int count= product.getProductCount()+1;
       product.setProductCount(count);
        productMap.put(product.getProductId(),product);
    }

    public void createOrder(String userId) throws Exception {

        if(!userMap.containsKey(userId)){
            throw new Exception("User ID not present");
        }

        List<Product>productList = new ArrayList<>();
        for(Product product : productMap.values()){
            char ch = product.getName().charAt(0);
            if(ch =='A'){
                productList.add(product);
            }
        }

        List<Order>orderList =  orderMap.getOrDefault(userId,new ArrayList<>());
        orderList.add(new Order(userId,productList));
        orderMap.put(userId,orderList);
    }

    public Product maxPriceProduct() {
        int max=0;
        Product maxProduct=null;

        for(Product product : productMap.values()){
            if(product.getPrice()>max){
                max= product.getPrice();
                maxProduct=product;
            }
        }
        return maxProduct;
    }

    public Product mostOrderProduct() {
        int maxCount = 0;
        Product mostProduct=null;

        for(Product product : productMap.values()){
            if(product.getProductCount()==0) continue;

            if(product.getProductCount()>maxCount){
                maxCount= product.getProductCount();
                mostProduct=product;
            }else if(product.getProductCount()==maxCount){
                if(product.getPrice()>mostProduct.getPrice()){
                    mostProduct=product;
                    maxCount= product.getProductCount();
                }
            }

        }
        return mostProduct;
    }
}
