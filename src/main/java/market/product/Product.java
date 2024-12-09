package main.java.market.product;
public class Product {
    
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }

    // Gettery

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    // Settery

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
            this.discountPrice = price;
        }
        
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

}
