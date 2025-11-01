package ex05.sec01.exam01;

public class Latte extends Coffee {
    private String foamType;
    private int milkCharge = 500;

    public Latte(String name, String size, int basePrice, String foamType) {
        super(name, size, basePrice);
        this.foamType = foamType;
    }

    @Override
    public String getBeverageInfo() {
        return "종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원 | 거품 종류: " + foamType;
    }

    public int getPrice(boolean extraShot) {
        int total = basePrice + milkCharge;
        if (extraShot) {
            total += 1000;
        }
        return total;
    }
}
