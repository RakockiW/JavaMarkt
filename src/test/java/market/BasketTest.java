package test.java.market;

import org.junit.*;

import main.java.market.basket.Basket;
import main.java.market.product.Product;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void testAddProduct() {
        Basket sut = new Basket();
        Product testProduct = new Product("A32", "Cup", 4);

        sut.addProduct(testProduct);

        assertEquals(1, sut.products.length);
    }
    
    @Test
    public void testRemoveProduct() {
        Basket sut = new Basket();
        Product testProduct = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Bowl", 10);
        Product testProduct3 = new Product("B64", "Horns", 50);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.removeProduct(testProduct2);
        assertEquals(2, sut.products.length);
    }
}
