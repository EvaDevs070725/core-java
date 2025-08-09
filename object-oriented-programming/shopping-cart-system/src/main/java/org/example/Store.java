package org.example;

import java.util.HashMap;
import java.util.Map;

//Holds available products and allows product lookup
public class Store {
    private final Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }
    public Product getProduct(int id) {return products.get(id);}

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product.getId() + ". "+ product.getName() + " " + product.getPrice());
        }
    }
}
