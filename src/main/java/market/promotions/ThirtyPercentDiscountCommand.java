package main.java.market.promotions;

import main.java.market.Product;
import main.java.market.cart.ShoppingCart;

public class ThirtyPercentDiscountCommand implements PromotionCommand {
    private String productCode;

    public ThirtyPercentDiscountCommand(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public void execute(ShoppingCart cart) {
        for (Product product : cart.getProducts()) {
            if (product.getCode().equals(productCode)) {
                product.setDiscountPrice(product.getPrice() * 0.7);
            }
        }
    }
}

