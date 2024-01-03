package ex13.example3;

abstract class Animal {
    public abstract void speak();
}

class Dog extends Animal {
    public String name;
    public int age;

    public void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public String name;
    public int age;

    public void speak() {
        System.out.println("야옹");
    }
}

public class GenericEx03 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[2];
        arr[0] = new Dog();
        arr[1] = new Cat();

        Animal d1 = (Dog) arr[0]; // [-> Object, Dog]
        Animal c1 = (Cat) arr[1]; // [-> Object, Cat]

        d1.speak();
        c1.speak();
    }
}
