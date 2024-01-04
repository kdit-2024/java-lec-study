package ex13;


class Account {
    public int balance = 1000;

    synchronized public void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println("출금 완료 : " + amount);
            balance = balance - amount;
        } else {
            System.out.println("잔액이 부족합니다 : " + balance);
        }
    }
}

public class DeadEx01 {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        new Thread(() -> {
            account.withdraw(1000);
        }).start();

        new Thread(() -> {
            account.withdraw(1000);
        }).start();


    }
}
