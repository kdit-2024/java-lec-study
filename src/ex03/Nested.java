package ex03;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("양수");
        } else if (number < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
    }
}
