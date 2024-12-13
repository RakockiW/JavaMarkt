package main.java.market.cart;

public class SortByNameCommand implements CartCommand {
    
    private ShoppingCart cart;

    public SortByNameCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.sortByName();
    }
    
}
