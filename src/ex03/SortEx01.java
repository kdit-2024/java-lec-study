package ex03;

import java.util.Arrays;
import java.util.List;

public class SortEx01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 2, 4, 3);

        list.stream().sorted();
    }
}
