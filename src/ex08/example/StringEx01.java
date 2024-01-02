package ex08.example;

public class StringEx01 {

    public static String encoding(String data) {
        int num = 1;
        String result = "";
        String[] arr = data.split("");

        for (int i = 1; i < data.length(); i++) {
            if (!arr[i - 1].equals(arr[i])) {
                result = result + arr[i - 1] + num;
                num = 1;
                continue;
            }
            num++;
        }
        return result;
    }

    public static String decoding(String convert) {
        String result = "";
        String[] arr = convert.split("");

        for (int i = 1; i < convert.length(); i++) {
            String s = arr[i - 1];
            int num = Integer.parseInt(arr[i]);
            for (int j = 0; j < num; j++) {
                result += s;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
        String convert = "A2B3C4D5"; //Byte -> 8Byte

        // 인코딩 A2B3C4D5
        data += ".";
        System.out.println(encoding(data));

        // 디코딩 AABBBCCCCDDDDD
        System.out.println(decoding(convert));
    }
}
