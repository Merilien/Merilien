package com.greenfox.webshop.models;

public class ShopItem implements Comparable<ShopItem> {
    private String name;
    private String description;
    private double price;
    private int quantityOfStock;


    public ShopItem(String name, String description, double price, int initialstock) {
        this.name = name;
        addDescription(description);
        setPrice(price);
        addToStock(initialstock);
    }

    public void addDescription(String description) {
        this.description = description;
    }

    public void addToStock(int quantity) {
        quantityOfStock += quantity;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public int getStock() {
        return quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(ShopItem o) {
        return (int) (this.price - o.getPrice());
    }
}
