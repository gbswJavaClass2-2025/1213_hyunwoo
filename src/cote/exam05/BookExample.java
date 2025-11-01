package cote.exam05;

public class BookExample {
    public static void main(String[] args) {
        Book[] book = new Book[3];

        String[] name = {"죄와벌", "백치", "악령"};
        String auther = "Fyodor Dostoevsky";
        int[] isbn = {978-89-374-6284-9, 978-89-374-6101-9, 978-89-374-6384-6};
        int[] price = {11000, 15000, 13000};

        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + " " + auther + isbn[i] + " " + price[i] + "원");
        }
    }
}
