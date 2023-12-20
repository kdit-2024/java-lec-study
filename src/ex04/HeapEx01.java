package ex04;


class Cat {
    String name;

    Cat() {
        //this.name = "토비";
        this("토비");
    }

    Cat(String name) {
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        // 망함
        Cat c = new Cat();
        System.out.println(c.name);
    }
}
