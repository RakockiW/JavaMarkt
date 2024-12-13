package test.java.market;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.market.Product;
import main.java.market.cart.AddProductCommand;
import main.java.market.cart.ShoppingCart;
import main.java.market.cart.ShoppingCartManager;

public class ShoppingCartManagerTest {
    
    @Test
    public void testAddCommand() {
        // given
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartManager sut = new ShoppingCartManager();
        
        Product testProduct1 = new Product("A32", "Cup", 4.0);
        Product testProduct2 = new Product("A42", "Bowl", 10.0);
        // when
        sut.addCommand(new AddProductCommand(testProduct1, cart));
        sut.addCommand(new AddProductCommand(testProduct2, cart));
        // then
        assertEquals(2, sut.commands.size());
    }
    
    @Test
    public void testExecuteCommands() {
        
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartManager sut = new ShoppingCartManager();
        
        Product testProduct1 = new Product("A32", "Cup", 4.0);
        Product testProduct2 = new Product("A42", "Bowl", 10.0);
        
        sut.addCommand(new AddProductCommand(testProduct1, cart));
        sut.addCommand(new AddProductCommand(testProduct2, cart));
        sut.executeCommands();
        
        
        assertEquals(2, cart.getProducts().length);
        assertEquals(14.0, cart.getTotalPrice(), 0.0);
    }
}
