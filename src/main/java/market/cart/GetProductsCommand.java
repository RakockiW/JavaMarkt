package main.java.market.cart;

public class GetProductsCommand implements CartCommand {
    
    private ShoppingCart cart;
    
    public GetProductsCommand(ShoppingCart cart) {
        this.cart = cart;
    }
    
    @Override
    public void execute() {
        cart.getProducts();
    }
    
}