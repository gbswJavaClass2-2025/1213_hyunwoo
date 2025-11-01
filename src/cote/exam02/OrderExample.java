package cote.exam02;

public class OrderExample {
    public static void main(String[] args) {
        Menu icecream = new Menu("아이스크림", 800);
        Menu cheese = new Menu("치즈", 1000);
        Menu cake = new Menu("케이크", 1800);

        OrderItem order = new OrderItem(cheese, 6);

        int totalPrice = order.getPrice();

        System.out.println("총 가격: " + totalPrice + "원");
    }
}
