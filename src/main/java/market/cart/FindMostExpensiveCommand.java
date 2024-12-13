package main.java.market.cart;

public class FindMostExpensiveCommand implements CartCommand {

    private ShoppingCart cart;
    
    public FindMostExpensiveCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    @Override
    public void execute() {
        cart.FindMostExpensive();
    }
    
}
