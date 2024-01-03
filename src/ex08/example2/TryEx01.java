package ex08.example2;

class Cal2 {
    // RuntimeException = 엄마가 알려주지 않았을 때
    public void divide(int num) throws Exception {
        throw new RuntimeException("오류 강제 발생");
    }
}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없어요");
        }
    }
}
