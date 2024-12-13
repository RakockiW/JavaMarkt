package test.java.market;

import org.junit.*;

import main.java.market.Product;
import main.java.market.cart.ShoppingCart;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testAddProduct() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 4);

        sut.addProduct(testProduct);

        assertEquals(1, sut.products.length);
    }
    
    @Test
    public void testRemoveProduct() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Bowl", 10);
        Product testProduct3 = new Product("B64", "Horns", 50);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.removeProduct(testProduct2);
        assertEquals(2, sut.products.length);
    }

    @Test
    public void testSortByPrice() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct1 = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Bowl", 10);
        Product testProduct3 = new Product("B64", "Horns", 2);

        sut.addProduct(testProduct1);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.sortByPrice();
        
        Product[] products = sut.getProducts();
        Product[] expectedProducts = {testProduct2, testProduct1, testProduct3};

        assertArrayEquals(expectedProducts, products);
    }

    @Test
    public void testSortByName() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct1 = new Product("A32", "Bowl", 4);
        Product testProduct2 = new Product("A34", "Cup", 10);
        Product testProduct3 = new Product("B64", "A-Horns", 4);

        sut.addProduct(testProduct1);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.sortByName();
        
        Product[] products = sut.getProducts();
        Product[] expectedProducts = {testProduct3, testProduct1, testProduct2};

        assertArrayEquals(expectedProducts, products);
    }

    @Test
    public void testSortAfterAdd() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct1 = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 30);
        Product testProduct4 = new Product("B24", "Aloe", 30);
        Product testProduct5 = new Product("B14", "Big Cup", 4);

        sut.addProduct(testProduct1);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.addProduct(testProduct4);
        sut.addProduct(testProduct5);

        Product [] expectedProducts = {testProduct4, testProduct3, testProduct2, testProduct5, testProduct1};
        Product [] products = sut.getProducts();
        
        assertArrayEquals(expectedProducts, products);
    }

    @Test
    public void testFindCheapest() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 3);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 30);
        Product testProduct4 = new Product("B24", "Aloe", 30);
        Product testProduct5 = new Product("B14", "Big Cup", 4);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.addProduct(testProduct4);
        sut.addProduct(testProduct5);
        
        assertEquals("Cup", sut.findCheapest().getName());
    }

    @Test
    public void testFindMostExpensive() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 3);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 40);
        Product testProduct4 = new Product("B24", "Aloe", 30);
        Product testProduct5 = new Product("B14", "Big Cup", 4);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.addProduct(testProduct4);
        sut.addProduct(testProduct5);

        
        assertEquals("Bowl", sut.FindMostExpensive().getName());
    }

    @Test
    public void testGetTotalPrice() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 10);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 40);
        Product testProduct4 = new Product("B24", "Aloe", 30);
        Product testProduct5 = new Product("B14", "Big Cup", 4);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.addProduct(testProduct4);
        sut.addProduct(testProduct5);
        
        assertEquals(Double.valueOf(94.), Double.valueOf(sut.getTotalPrice()));

    }

    
}
