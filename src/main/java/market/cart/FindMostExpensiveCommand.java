package main.java.market.cart;

import main.java.market.command.Command;

public class FindMostExpensiveCommand implements Command {

    private ShoppingCart cart;
    
    public FindMostExpensiveCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void execute() {
        cart.FindMostExpensive();
    }
    
}
