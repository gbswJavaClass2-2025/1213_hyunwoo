package ex08.sec01.exam01;

public class Employee extends Person {
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void work() {
        System.out.println("직원이 근무 중입니다.");
    }
}