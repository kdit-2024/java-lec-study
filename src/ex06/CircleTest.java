package ex06;

class Shape {
    int x, y;

    public Shape(int x, int y) {
        System.out.println("매개변수가 있는 Shape 생성됨");
        this.x = x;
        this.y = y;
    }

}

class Circle extends Shape {
    int radius; // 반지름

    public Circle(int radius) {
        super(1, 2);
        System.out.println("Circle 생성됨");
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
    }
}
