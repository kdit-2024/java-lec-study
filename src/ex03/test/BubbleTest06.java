package ex03.test;

/**
 * * 1회전 (4바퀴)
 * * (1) 5, 8 비교 (변화없음)
 * * (2) 8, 2 비교 (5,2,8,4,3)
 * * (3) 8, 4 비교 (5,2,4,8,3)
 * * (4) 8, 3 비교 (5,2,4,3,8)
 */
public class BubbleTest06 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;

        for (int loop = 1; loop < 5; loop++) {
            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // 출력코드
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
