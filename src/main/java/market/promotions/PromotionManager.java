package main.java.market.promotions;

import java.util.ArrayList;
import java.util.List;

import main.java.market.cart.ShoppingCart;

public class PromotionManager {
    private List<PromotionCommand> promotions = new ArrayList<>();

    public void addPromotion(PromotionCommand promotion) {
        promotions.add(promotion);
    }

    public void removePromotion(PromotionCommand promotion) {
        promotions.remove(promotion);
    }

    public void executePromotions(ShoppingCart cart) {
        for (PromotionCommand promotion : promotions) {
            promotion.execute(cart);
        }
    }
}
