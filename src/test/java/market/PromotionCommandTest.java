package test.java.market;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.Test;

import main.java.market.Product;
import main.java.market.cart.ShoppingCart;
import main.java.market.promotions.BuyTwoGetOneFreeCommand;
import main.java.market.promotions.FivePercentDiscountCommand;
import main.java.market.promotions.FreeMugCommand;
import main.java.market.promotions.PromotionManager;
import main.java.market.promotions.ThirtyPercentDiscountCommand;

public class PromotionCommandTest {

    @Test
    public void testFivePercentDiscountCommand() {
        ShoppingCart cart = new ShoppingCart();

        Product testProduct1 = new Product("A32", "Speakers", 300);
        Product testProduct2 = new Product("A34", "Tuner", 100);

        cart.addProduct(testProduct1);
        cart.addProduct(testProduct2);

        FivePercentDiscountCommand command = new FivePercentDiscountCommand();
        command.execute(cart);

        assertEquals(380, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testBuyTwoGetOneFreeCommand() {
        ShoppingCart cart = new ShoppingCart();

        Product testProduct1 = new Product("A32", "Cup", 3);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 30);

        cart.addProduct(testProduct1);
        cart.addProduct(testProduct2);
        cart.addProduct(testProduct3);

        BuyTwoGetOneFreeCommand command = new BuyTwoGetOneFreeCommand();
        command.execute(cart);

        assertEquals(40, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testFreeMugCommand() {
        ShoppingCart cart = new ShoppingCart();

        Product testProduct1 = new Product("A32", "Cup", 3);
        Product testProduct2 = new Product("A34", "TV", 250);

        cart.addProduct(testProduct1);
        cart.addProduct(testProduct2);
        
        FreeMugCommand command = new FreeMugCommand();
        command.execute(cart);
        
        assertEquals(3, cart.products.length);
        
    }

    @Test
    public void testThirtyPercentDiscountCommand() {
        ShoppingCart cart = new ShoppingCart();

        Product testProduct1 = new Product("A32", "Cup", 10);
        Product testProduct2 = new Product("A34", "Horns", 10);

        cart.addProduct(testProduct1);
        cart.addProduct(testProduct2);

        ThirtyPercentDiscountCommand command = new ThirtyPercentDiscountCommand("A32");
        command.execute(cart);

        assertEquals(17, cart.getTotalPrice(), 0.01);
    }

    @Test
    public void testPromotionManager() {
        ShoppingCart cart = new ShoppingCart();
        
        Product testProduct1 = new Product("A32", "Cup", 3);
        Product testProduct2 = new Product("A34", "Horns", 60);
        Product testProduct3 = new Product("B64", "Bowl", 40);
        Product testProduct4 = new Product("B24", "Speakers", 200);
        Product companyMug = new Product("A32", "Company Mug", 0);

        cart.addProduct(testProduct1);
        cart.addProduct(testProduct2);
        cart.addProduct(testProduct3);
        cart.addProduct(testProduct4);


        PromotionManager promotionManager = new PromotionManager();
        promotionManager.addPromotion(new FivePercentDiscountCommand());
        promotionManager.addPromotion(new BuyTwoGetOneFreeCommand());
        promotionManager.addPromotion(new FreeMugCommand());
        promotionManager.addPromotion(new ThirtyPercentDiscountCommand("A34"));

        promotionManager.executePromotions(cart);

        assertEquals(5, cart.products.length);
        assertEquals(267.9, cart.getTotalPrice(), 0.01);
    }
}