package main.java.market.cart;

import main.java.market.command.Command;

public class SortByPriceCommand implements Command {
    
    private ShoppingCart cart;

    public SortByPriceCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.sortByPrice();
    }
    
}
