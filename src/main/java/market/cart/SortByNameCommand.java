package main.java.market.cart;

import main.java.market.command.Command;

public class SortByNameCommand implements Command {
    
    private ShoppingCart cart;

    public SortByNameCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.sortByName();
    }
    
}
