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

    // 기본 가격
    public int getPrice() {
        return basePrice;
    }

    // 할인 적용 가격 (오버로딩)
    public int getPrice(double discountRate) {
        double discounted = basePrice * (1 - discountRate / 100.0);
        return (int) discounted;
    }

    public String getBeverageInfo() {
        return "종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원";
    }
}
