package com.example.ecommercestore;

public class ShoppingCart {
    private String item;
    private int quantity;
    private int index;

    public ShoppingCart(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public ShoppingCart(int index, String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.index = index;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    

    

}
