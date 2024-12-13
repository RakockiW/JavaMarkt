package main.java.market.cart;

import main.java.market.command.Command;

public class GetTotalPriceCommand implements Command {

    private ShoppingCart cart;

    public GetTotalPriceCommand(ShoppingCart cart) {
        this.cart = cart;    
    }

    @Override
    public void execute() {
        cart.getTotalPrice();
    }
    
}
