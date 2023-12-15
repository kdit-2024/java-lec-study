package ex03;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int x = 2; x <= 9; x++) {
                System.out.print(x + "*" + i + "=" + x * i + "  ");
            }
            System.out.println();
        }
    }
}
