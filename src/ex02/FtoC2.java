package ex02;

import java.util.Scanner;

public class FtoC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨(세계표준 C)온도를 입력하시오 : ");

        // 1. 섭씨 온도 받기
        double temp = sc.nextDouble();
        //System.out.println(c);

        // 2. 섭씨 -> 화씨 온도로 변환
        double result = 9.0 / 5.0 * temp + 32;
        System.out.println(result);
    }
}
