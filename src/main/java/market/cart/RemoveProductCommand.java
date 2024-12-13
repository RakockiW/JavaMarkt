package main.java.market.cart;

import main.java.market.Product;
import main.java.market.command.Command;

public class RemoveProductCommand implements Command {
    
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
