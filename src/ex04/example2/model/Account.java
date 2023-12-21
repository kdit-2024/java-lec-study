package ex04.example2.model;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    // 메서드는 하나의 책임만 가진다.
    public void 출금(long amount) {
        this.balance = this.balance - amount;
    }

    public void 입금(long amount) {
        this.balance = this.balance + amount;
    }

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
