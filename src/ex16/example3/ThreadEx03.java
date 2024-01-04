package ex16.example3;

import javax.swing.*;

public class ThreadEx03 extends JFrame {
    private boolean state = true;
    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자1: " + count);
        count2Label = new JLabel("숫자2: " + count2);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(count2Label);

        // 멈춤 버튼 생성
        JButton increaseButton = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
            state = false;
        });

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count++;
                    countLabel.setText("숫자1 : " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();

        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자2 : " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new ThreadEx03();
    }
}