package test.java.market;

import org.junit.*;

import main.java.market.ShoppingCart;
import main.java.market.Product;

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
        Product testProduct = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Bowl", 10);
        Product testProduct3 = new Product("B64", "Horns", 2);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.sortByPrice();
        assertEquals(Double.valueOf(10.), Double.valueOf(sut.products[0].getPrice()));
        assertEquals(Double.valueOf(4.), Double.valueOf(sut.products[1].getPrice()));
        assertEquals(Double.valueOf(2.), Double.valueOf(sut.products[2].getPrice()));
    }

    @Test
    public void testSortByName() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Bowl", 10);
        Product testProduct3 = new Product("B64", "A-Horns", 4);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.sortByName();
        assertEquals("A-Horns", sut.products[0].getName());
        assertEquals("Bowl", sut.products[1].getName());
        assertEquals("Cup", sut.products[2].getName());
    }

    @Test
    public void testSortAfterAdd() {
        ShoppingCart sut = new ShoppingCart();
        Product testProduct = new Product("A32", "Cup", 4);
        Product testProduct2 = new Product("A34", "Horns", 10);
        Product testProduct3 = new Product("B64", "Bowl", 30);
        Product testProduct4 = new Product("B24", "Aloe", 30);
        Product testProduct5 = new Product("B14", "Big Cup", 4);

        sut.addProduct(testProduct);
        sut.addProduct(testProduct2);
        sut.addProduct(testProduct3);
        sut.addProduct(testProduct4);
        sut.addProduct(testProduct5);
        
        assertEquals("Aloe", sut.products[0].getName());
        assertEquals("Bowl", sut.products[1].getName());
        assertEquals("Horns", sut.products[2].getName());
        assertEquals("Big Cup", sut.products[3].getName());
        assertEquals("Cup", sut.products[4].getName());
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
