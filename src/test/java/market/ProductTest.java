package test.java.market;

import org.junit.*;

import main.java.market.Product;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    
    @Test
    public void testCreateProduct() {
        Product sut = new Product("AB32", "Cup", 4.5);
        assertEquals("Cup", sut.getName());
        sut.setName("Branded Cup");
        assertEquals("Branded Cup", sut.getName());
    }
    
}
