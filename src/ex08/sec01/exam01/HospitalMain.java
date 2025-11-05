package ex08.sec01.exam01;

public class HospitalMain {
    public static void main(String[] args) {
        System.out.println("----- 병원 관리 시스템 시작 -----");

        Doctor doctor1 = new Doctor("김하늘", 101);
        Doctor doctor2 = new Doctor("이민호", 102, 9000);
        Nurse nurse1 = new Nurse("박수진", 201, 5000);

        Person person1 = doctor1;
        Person person2 = nurse1;

        person1.work();
        person2.work();

        System.out.println("의사 1 급여: " + doctor1.calculateSalary());
        System.out.println("의사 2 급여: " + doctor2.calculateSalary());
        System.out.println("간호사 급여: " + nurse1.calculateSalary());

        System.out.println("----- 병원 관리 시스템 종료 -----");
    }
}