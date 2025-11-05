package ex08.sec01.exam01;

public class Doctor extends Employee {

    Doctor(String name, int id) {
        super(name, id, 7000);
    }

    Doctor(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("의사 " + name + "님이 진료를 시작합니다.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + baseSalary * 0.3;
    }
}