package ex04;

public class MethodEx01 {

    static void m1() {
        System.out.println("m1");
    }

    static String m2() {
        System.out.println("m2");
        return "m2"; // 메서드 종료
    }

    public static void main(String[] args) {
        m1();
        String result = m2();
        System.out.println("result : " + result);
    }
}
