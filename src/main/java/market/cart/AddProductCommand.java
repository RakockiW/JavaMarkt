package main.java.market.cart;

import main.java.market.Product;
import main.java.market.command.Command;

public class AddProductCommand implements Command {

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
