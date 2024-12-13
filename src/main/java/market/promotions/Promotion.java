package main.java.market.promotions;

import main.java.market.cart.ShoppingCart;

public interface Promotion {
    void apply(ShoppingCart basket);
}
