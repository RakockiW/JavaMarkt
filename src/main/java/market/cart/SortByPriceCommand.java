package main.java.market.cart;

public class SortByPriceCommand implements CartCommand {
    
    private ShoppingCart cart;

    public SortByPriceCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.sortByPrice();
    }
    
}
