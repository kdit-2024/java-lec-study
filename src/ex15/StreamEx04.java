package ex15;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
