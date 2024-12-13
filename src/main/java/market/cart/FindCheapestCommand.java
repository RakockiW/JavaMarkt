package main.java.market.cart;

public class FindCheapestCommand implements CartCommand {

    private ShoppingCart cart;
    
    public FindCheapestCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void execute() {
        cart.findCheapest();
    }
    
}
