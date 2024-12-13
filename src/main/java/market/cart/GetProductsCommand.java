package main.java.market.cart;

import main.java.market.command.Command;

public class GetProductsCommand implements Command {
    
    private ShoppingCart cart;
    
    public GetProductsCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.getProducts();
    }
    
}