package main.java.market.cart;

import main.java.market.Product;

public class AddProductCommand implements CartCommand {

    private Product product;
    private ShoppingCart cart;

    public AddProductCommand(Product product, ShoppingCart cart) {
        this.product = product;
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.addProduct(product);
    }
    
}
