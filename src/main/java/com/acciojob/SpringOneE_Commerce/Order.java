package com.acciojob.SpringOneE_Commerce;

import java.util.List;

public class Order {
    private String userId;
    private List<Product> paymentMode;

    public Order() {
    }

    public Order(String userId, List<Product> paymentMode) {
        this.userId = userId;
        this.paymentMode = paymentMode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Product> getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(List<Product> paymentMode) {
        this.paymentMode = paymentMode;
    }
}
