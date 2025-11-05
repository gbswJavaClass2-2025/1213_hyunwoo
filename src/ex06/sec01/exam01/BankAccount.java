package ex06.sec01.exam01;

public class BankAccount {
    public String name;
    public String accountNumber;
    public int balance = 0;

    public BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        System.out.println(">>BankAccount 객체 생: " + name + " 계좌(" + accountNumber + ") 개설.");
    }
    public void print() {System.out.println("일반 계좌 정보: 계좌 번호: " + accountNumber + "| 예금주: " + name + " | 잔액: " + balance + "원" );}
    public void deposit(int price) {
        balance += price;
        System.out.println("[입금] 금액: " + price + " 원 | 현재 잔액: " + balance + " 원");
    }
    public void deposit(int price, String from) {
        balance += price;
        System.out.println("[입금] 금액: " + price + " 원 (" + from + "으로부터) | 현재 잔액: " + balance + " 원");
    }
}
