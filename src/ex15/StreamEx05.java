package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// 상대 경로 : 실행되는 위치(프로젝트폴더) 기반으로 경로 정하는 것
// 절대 경로 : 루트에서 부터 경로를 찾는것
// 윈도우 : C:\\workspace\\hello.txt
// 맥,리눅스 : /workspace/hello.txt
public class StreamEx05 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt"));
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt"));

            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
