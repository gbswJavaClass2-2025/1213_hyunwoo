package ex06.sec01.exam01;

public class BankPractice {
    public static void main(String[] args) {
        System.out.println("----- 은행 계좌 시스템 실습 시작 -----");
        BankAccount stand = new BankAccount("김철수", "100-01-123456");
        SavingsAccount save = new SavingsAccount("이영희", "200-02-789012", 2.5);
        System.out.println("-----------------------------");
        System.out.println("[정보출력]");
        stand.print();
        save.print();
        System.out.println("-----------------------------");
        System.out.println("[입금 기능]");
        System.out.println("--- 김철수님 일반 계좌 ---");
        stand.deposit(100000);
        stand.deposit(50000, "월급");
        System.out.println("--- 이영희님 저축 계좌 ---");
        save.deposit();
        save.deposit(20000);
        save.deposit(15000, "용돈");
        System.out.println("----- 실습 종료 -----");
    }
}
