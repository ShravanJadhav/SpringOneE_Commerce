package com.acciojob.SpringOneE_Commerce;

public class Product {
    private String productId;
    private String name;
    private String category;
    private int price;

    private int productCount;

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Product() {
    }

    public Product(String productId, String name, String category, int price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.productCount=0;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
