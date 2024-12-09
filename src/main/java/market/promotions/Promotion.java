package main.java.market.promotions;

import main.java.market.basket.Basket;

public interface Promotion {
    public void apply(Basket basket);
}
