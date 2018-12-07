package com.greenfox.webshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebShop {
    private String currency;
    private List<ShopItem> items;

    public WebShop(String currency) {
        this.currency = currency;
        items = new ArrayList<>();
    }

    public void addItem(ShopItem item) {
        items.add(item);
    }

    public List<ShopItem> getItems() {
        return items;
    }

    public List<ShopItem> listAvailable() {
        List<ShopItem> availableItems = new ArrayList<>();
        for (ShopItem item : items) {
            if (item.getStock() > 0) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    public List<ShopItem> listByPrice() {
        List<ShopItem> sortedItems = new ArrayList<>(items);
        Collections.copy(sortedItems, items);
        Collections.sort(sortedItems);
        return sortedItems;
    }

    public List<ShopItem> filterByKeyword(String keyword) {
        List<ShopItem> matchingItems = new ArrayList<>();
        for (ShopItem item : items) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                matchingItems.add(item);
            }
        }
        return matchingItems;
    }

    public double getAverageStock() {
        double counter = 0;
        for (ShopItem item : items) {
            counter += item.getStock();
        }
        return counter/items.size();
    }

    public String getMostExpensive() {
        List<ShopItem> availableItems = listAvailable();
        Collections.sort(availableItems);
        return availableItems.get(availableItems.size()-1).getName();
    }

}
