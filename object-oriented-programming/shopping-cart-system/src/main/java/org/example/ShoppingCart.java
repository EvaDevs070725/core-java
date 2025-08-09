package org.example;

import org.example.CartItem;
import org.example.Product;

import java.util.ArrayList;
import java.util.List;

//Handles a list of CartItems and cart operations
public class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity){
        for(CartItem item: items){
            if(item.getProduct().getId() == product.getId()){
                System.out.println("item already exists");
                item.addQuantity(quantity);
                return;
            }
            //System.out.println(item);
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product, int quantity){
        for(CartItem item: items){
            if(item.getProduct().getId() == product.getId()){
                item.subtractQuantity(quantity);
            }
        }
    }

    public double getTotal(){
        double total = 0;
        for(CartItem item: items){
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }


    public void clear() {
        items.clear();
    }
    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item.toString());
        }
    }
}
