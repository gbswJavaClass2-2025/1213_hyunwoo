package cote.exam07;

public class EmployeeExample {
    public static void main(String[] args) {
        FullTimeEmployee full = new FullTimeEmployee("이현우", "1213", 60000000);
        PartTimeEmployee part = new PartTimeEmployee("사람", "1111", 20000, 80);

        System.out.println(full.Pay() + "원");
        System.out.println(part.Pay() + "원");
    }
}
