package main.java.market.promotions;

import main.java.market.cart.ShoppingCart;

public interface PromotionCommand {
    void execute(ShoppingCart cart);
}