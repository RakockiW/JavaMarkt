package main.java.market.promotions;

import main.java.market.cart.ShoppingCart;

public class FivePercentDiscountCommand implements PromotionCommand {
    @Override
    public void execute(ShoppingCart cart) {
        cart.applyDiscount(0.05);
    }
}