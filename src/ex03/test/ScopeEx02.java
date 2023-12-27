package ex03.test;


class Account {
    private int number; // 1111
    private String pw; // 8877
    private String author; // 최주호
    private int balance; // 1000

    public Account(int number, String pw, String author, int balance) {
        this.number = number;
        this.pw = pw;
        this.author = author;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getPw() {
        return pw;
    }


    public String getAuthor() {
        return author;
    }

    public int getBalance() {
        return balance;
    }


    public void chanagePassword(String pw) {
        this.pw = pw;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class ScopeEx02 {
    public static void main(String[] args) {
        // 1. 계좌생성 (2023.12.25)
        Account account = new Account(1111, "8877", "최주호", 1000);

        // 2. 입금 (2023.01.10) - 5000
        account.deposit(5000);

        // 3. 비밀번호 변경 (2023.01.20) - 9988
        account.chanagePassword("9988");

        // 4. 계명 - 이름 변경 (2023.02.20) - 홍길동
        account.changeAuthor("홍길동");

        // 5. 계좌번호변경 - 은행 - 불가능합니다.

        // 6. 출금 - 500원
        account.withdraw(500);

        // 7. 5000 원 입금
        int currentBalance = account.getBalance();
        int balance = currentBalance + 5000;
        account.setBalance(balance);
    }
}










