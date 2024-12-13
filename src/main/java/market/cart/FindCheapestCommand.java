package main.java.market.cart;

import main.java.market.command.Command;

public class FindCheapestCommand implements Command {

    private ShoppingCart cart;
    
    public FindCheapestCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void execute() {
        cart.findCheapest();
    }
    
}
