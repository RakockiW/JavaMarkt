package main.java.market.cart;

import main.java.market.Product;

public class RemoveProductCommand implements CartCommand {
    
    private Product product;
    private ShoppingCart cart;

    public RemoveProductCommand(Product product, ShoppingCart cart) {
        this.product = product;
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
    }
}
