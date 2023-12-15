package ex03.test;

/**
 * * 1회전 (4바퀴)
 * * (1) 5, 8 비교 (변화없음)
 * * (2) 8, 2 비교 (5,2,8,4,3)
 * * (3) 8, 4 비교 (5,2,4,8,3)
 * * (4) 8, 3 비교 (5,2,4,3,8)
 */
public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;

        for (int i = 0; i < 4; i++) {
            if (arr[0] > arr[1]) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
        }


        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
