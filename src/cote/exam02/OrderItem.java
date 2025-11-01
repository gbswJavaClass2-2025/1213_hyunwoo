package cote.exam02;

public class OrderItem {
    public Menu menu;       // Menu 객체를 포함
    public int quantity;

    public OrderItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public int getPrice() {
        return menu.price * quantity;
    }
}