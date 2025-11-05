package ex08.sec01.exam01;

public class Nurse extends Employee {

    Nurse(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("간호사 " + name + "님이 환자를 돌봅니다.");
    }
}