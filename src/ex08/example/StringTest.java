package ex08.example;

public class StringTest {
    public static void main(String[] args) {
        String username = "홍길동";

        String introduce = "당신은 " + username + "인가요?";
        System.out.println(introduce);

        String newIntroduce = "당신은 $username 인가요?".replace("$username", username);
        System.out.println(newIntroduce);

    }
}
