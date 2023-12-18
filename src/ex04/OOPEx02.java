package ex04;

class Person4 {
    // 상태 = 변수
    private int weight = 100;

    public int getWeight() {
        return weight;
    }

    // 행위 = 메서드
    public void exercise() {
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {


        Person4 p4 = new Person4();
        Person4 p5 = new Person4();

        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());

        p4.exercise();
        System.out.println("p4의 몸무게 : " + p4.getWeight());
        System.out.println("p5의 몸무게 : " + p5.getWeight());
    }
}
