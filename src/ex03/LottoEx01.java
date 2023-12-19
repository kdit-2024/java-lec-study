package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        for (int i = 0; i < arr.length; i++) {
            // 첫번째 루프는 무조건 추가한다.
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }
            // 두번째 루프 부터는 이전 배열을 다 확인하고 추가한다.
            while (true) {
                isSame = false;
                num = r.nextInt(45) + 1;

                // 이전 번호들과 비교
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == num) {
                        isSame = true;
                        break;
                    }
                }

                // 비교한 번호중 하나라도 같은 번호가 없다면?
                if (!isSame) {
                    arr[i] = num;
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
