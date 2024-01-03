package ex13.example2;

class Box {
    static Object data;
}

public class GenericEx02 {
    public static void main(String[] args) {
        Box.data = 1;
        Box.data = "문자";
    }
}
