package ex05.sec01.exam01;

public class Coffee {
    protected String name;
    protected String size;
    protected int basePrice;

    public Coffee(String name, String size, int basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    public int getPrice() {
        return basePrice;
    }

    public int getPrice(double discountRate) {
        double discounted = basePrice * (1 - discountRate / 100.0);
        return (int) discounted;
    }

    public String getBeverageInfo() {
        return "종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원";
    }
}
