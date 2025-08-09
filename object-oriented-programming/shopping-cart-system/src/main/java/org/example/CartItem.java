package org.example;
//Represents a product and quantity in the shopping cart
public class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {return product;}
    public int getQuantity() {return quantity;}

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    public void addQuantity(int amount){
        quantity = quantity + amount;
    }
    public void subtractQuantity(int amount){
        quantity = quantity - amount;
    }
    @Override
    public String toString() {
        return "CartItem{" + "id=" + product.getId() + ", product=" + product.getName() + ", quantity=" + quantity + '}';
    }

}
