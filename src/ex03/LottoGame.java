package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoGame {

    static int[] 로또구매() {
        int arr[] = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < 6; i++) {
            num = r.nextInt(45) + 1;
            arr[i] = num;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == num) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(arr);

        return arr;
    }

    static int[] 로또추첨() {
        int arr[] = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < 6; i++) {
            num = r.nextInt(45) + 1;
            arr[i] = num;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == num) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(arr);

        return arr;
    }

    static boolean 로또당첨확인(int[] buy, int[] lotto) {
        boolean isCorrect = true;

        for (int i = 0; i < 6; i++) {
            if (buy[i] != lotto[i]) {
                isCorrect = false;
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        int[] lotto = 로또추첨();
        System.out.println("추첨한 로또 번호 : " + Arrays.toString(lotto));

        long money = 0;
        while (true) {
            money = money + 1000;
            int[] buy = 로또구매();

            if (로또당첨확인(buy, lotto)) {
                System.out.println("구매한 로또 번호 : " + Arrays.toString(buy));
                break;
            }
        }

        System.out.println("로또 구매시 사용된 금액 : " + money + "원");


    }
}
