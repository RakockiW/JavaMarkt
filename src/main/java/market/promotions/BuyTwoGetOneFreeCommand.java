package main.java.market.promotions;

import main.java.market.Product;
import main.java.market.cart.ShoppingCart;

public class BuyTwoGetOneFreeCommand implements PromotionCommand {
    @Override
    public void execute(ShoppingCart cart) {
        if (cart.products.length > 2) {
            Product product = cart.findCheapest();
            product.setPrice(0);
        }
    }
}
