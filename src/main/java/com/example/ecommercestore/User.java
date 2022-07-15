package com.example.ecommercestore;

public class User {

    private String userName;
    private ShoppingCart cart;
    
    public User(String userName, ShoppingCart cart) {
        this.userName = userName;
        this.cart = cart;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    

}
