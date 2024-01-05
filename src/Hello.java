import java.util.Arrays;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);

        arr.stream().map(i -> i * 2).filter(i -> i > 3).toList();
    }

}
