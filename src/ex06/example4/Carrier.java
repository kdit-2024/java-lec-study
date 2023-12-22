package ex06.example4;

public class Carrier extends Protoss {
    String name;

    public Carrier(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("캐리어가 공격합니다 : " + name);
    }
}
