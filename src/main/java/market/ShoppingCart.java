package main.java.market;

public class ShoppingCart {

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
        
        sortAfterAdd();
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

    public void sortByPrice() {
        java.util.Arrays.sort(products, java.util.Collections.reverseOrder(new ProductPriceComparator()));
    }

    public void sortByName() {
        java.util.Arrays.sort(products, new ProductNameComparator());
    }

    public void sortAfterAdd() {
        java.util.Arrays.sort(products, java.util.Collections.reverseOrder(new ProductPriceComparator())
            .thenComparing(new ProductNameComparator()));
    }

    public Product findCheapest() {
        Product cheapest = products[0];
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }
        return cheapest;
    }

    public Product FindMostExpensive() {
        Product mostExpensive = products[0];
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

}
