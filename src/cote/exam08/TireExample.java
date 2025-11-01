package cote.exam08;

public class TireExample {
    public static void main(String[] args) {
        Tire normalTire = new Tire("일반타이어", 5000);
        WideTire wideTire = new WideTire("개쩌는 타이어", 7000, 300);
        ColorTire colorTire = new ColorTire("색상타이어", 6000, "red");

        System.out.println("모델: " + normalTire.getModel());
        System.out.println("모델: " + wideTire.getModel() + ", 너비: " + wideTire.getWidth());
        System.out.println("모델: " + colorTire.getModel() + ", 색상: " + colorTire.getColor());

    }
}
