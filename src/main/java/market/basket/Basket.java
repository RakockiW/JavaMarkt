package main.java.market.basket;

import main.java.market.product.Product;

public class Basket {

    public Product[] products = new Product[0];

    public void addProduct(Product product) {
       
        int n;
		if (products == null) {
			n = 0;
		} else {
			n = products.length;
		}	

		Product[] tempProducts = new Product[n+1];
		
		for (int i=0; i<n; i++) {
			tempProducts[i] = products[i];
		}

		tempProducts[n] = product;

		products = tempProducts;
    }

    private int findProduct(Product product) {
        
        int n = products.length;

        for (int i=0; i<n; i++) {
            if (products[i].getCode().equals(product.getCode())) {
                return i;
            }
        }
        return -1;
    }

    public void removeProduct(Product product) {
       
        int n;
		if (products == null) {
			return;
		}

        n = products.length;
        int productToRemoveIndex = findProduct(product);

		for (int i=productToRemoveIndex; i<n-1; i++) {
            products[i] = products[i+1];
        }

        Product[] tempProducts = new Product[n-1];

        for (int i=0; i<n-1; i++) {
            tempProducts[i] = products[i];
        }

        products = tempProducts;

    }

}
