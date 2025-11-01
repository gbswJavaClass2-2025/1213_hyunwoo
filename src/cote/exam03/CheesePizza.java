package cote.exam03;

public class CheesePizza {
    public String name="CheesePizza";
    public int[] prices = { 11000, 16000, 20000};
    public String size = "M";

    public CheesePizza() {
        this.size = "M";
    }
    public CheesePizza(String size) {
        this.size = "L";
    }

    public void cook() {
        System.out.println(name + " " + size + " 을 조리합니다. ");
        System.out.println(name + " " + size + " 이 완성되었습니다.");
    }

    public void serve() {
        System.out.println(name + " " + size + " 를 드립니다. " + prices[2] + "입니다.");
    }
}