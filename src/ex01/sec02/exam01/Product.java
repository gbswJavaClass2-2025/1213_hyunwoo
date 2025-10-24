package ex01.sec02.exam01;

public class Product {
    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;
    Product(String productId, String productName, String productArea, int price, double tax ){
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }
    public String Information() {
        return (this.productId + " " + this.productName + " " + this.productArea + " " + this.price + " " + this.tax);
    }
    public int GetPrice() {
        return this.price;
    }
    public void SetPrice(int price) {
        this.price = price;
    }
    public double GetTax() {
        return this.tax;
    }
    public void SetTax(double tax) {
        this.tax = tax;
    }
    public String GetProductName() {
        return this.productName;
    }
}
