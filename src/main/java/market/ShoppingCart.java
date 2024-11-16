package main.java.market;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String code) {
        products.removeIf(product -> product.getCode().equals(code));
    }
}
