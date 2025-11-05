package ex06.sec01.exam01;

public class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String name, String accountNumber,  double interestRate) {
        super(name, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void print() {
        System.out.println("저축 계좌 정보: 계좌 번호: " + accountNumber + " | 예금주: " + name + " | 잔액: 0 원 | 이율: " + interestRate + "% (저축 계좌)");
    }
    public void deposit() {
        balance += 50000;
        System.out.println("[입금] 금액: 50,000 원 (초기 납입금) | 현재 잔액: " + balance + " 원");
    }

}
