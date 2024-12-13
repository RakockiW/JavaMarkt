package main.java.market.cart;

public class GetTotalPriceCommand implements CartCommand {

    private ShoppingCart cart;

    public GetTotalPriceCommand(ShoppingCart cart) {
        this.cart = cart;    
    }

    @Override
    public void execute() {
        cart.getTotalPrice();
    }
    
}
