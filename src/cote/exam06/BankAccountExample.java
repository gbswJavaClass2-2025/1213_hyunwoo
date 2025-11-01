package cote.exam06;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("이현우", "111111111");

        int deposit = account.deposit(100000);
        System.out.println(deposit + "원");

        int withdrawal = account.withdrawal(30000);
        System.out.println(withdrawal + "원");

        int allback = account.withdrawal(600000);
        System.out.println(allback + "원");
    }
}
