package ex03;

/**
 * 5, 8, 2, 4, 3 (N)
 * 회전수 : N-1
 * 1회전 비교 횟수 : N-1
 * 2회전 비교 횟수 : N-2
 * 3회전 비교 횟수 : N-3
 * 4회전 비교 횟수 : N-4
 * <p>
 * 1회전 (4바퀴)
 * (1) 5, 8 비교 (변화없음)
 * (2) 8, 2 비교 (5,2,8,4,3)
 * (3) 8, 4 비교 (5,2,4,8,3)
 * (4) 8, 3 비교 (5,2,4,3,8)
 * <p>
 * 2회전 (3바퀴)
 * (1) 5,2 비교 (2,5,4,3,8)
 * (2) 5,4 비교 (2,4,5,3,8)
 * (3) 5,3 비교 (2,4,3,5,8)
 * <p>
 * 3회전 (2바퀴) - 끝
 * (1) 2,4 비교
 * (2) 4,3 비교 (2,3,4,5,8)
 * <p>
 * 4회전 (1바퀴)
 * (1) 2,3 비교
 */

public class BubbleEx01 {

    static void bubble(int[] arr) {
        final int N = arr.length;

        int temp;

        for (int loop = 1; loop < N; loop++) {
            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // 출력코드
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr);
        System.out.println();

        int[] arr2 = {5, 8, 2, 4, 3, 10, 500, 7, 6};
        BubbleEx01.bubble(arr2);
    }
}
