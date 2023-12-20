package ex04;

// 설계도
class People {
    private String name;
    private int power;
    private int hp;

    public People() {

    }

    // 객체 초기화
    public People(String name, int power) {
        this.name = name;
        this.power = power;
        this.hp = 100;
    }

    // 행위
    public void upgradePower() {
        this.power++;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}


public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모", 10);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}
