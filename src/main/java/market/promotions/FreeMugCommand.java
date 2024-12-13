package main.java.market.promotions;

import main.java.market.Product;
import main.java.market.cart.ShoppingCart;

public class FreeMugCommand implements PromotionCommand {
    @Override
    public void execute(ShoppingCart cart) {
        if (cart.getTotalPrice() > 200) {
            cart.addProduct(new Product("A32", "Company Mug", 0));
        }
    }
}
