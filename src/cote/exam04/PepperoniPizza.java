package cote.exam04;

public class PepperoniPizza extends Pizza {
    public String name = "PepperoniPizza";
    public int[] prices = { 13000, 18000, 23000 };
    public String size;
    public String toppings = "pepperoni";

    public PepperoniPizza() {
        this.size = "M";
    }

    public PepperoniPizza(String size) {
        this.size = "L";
    }

    public void cook() {
        System.out.println(toppings + "을 추가합니다.");
        System.out.println(name + " " + size + " 을 조리합니다. ");
        System.out.println(name + " " + size + " 이 완성되었습니다.");
    }

    public void serve() {
        System.out.println(name + " " + size + " 를 드립니다. " + prices[2] + "입니다.");
    }
}
