package ex06.example4;

public class Scout extends Protoss {
    String name;

    public Scout(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("스카우트가 공격합니다 : " + name);
    }
}
