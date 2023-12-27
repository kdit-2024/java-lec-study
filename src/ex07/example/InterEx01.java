package ex07.example;


class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
}

interface Remocon {
    void on();

    void off();
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 */
class CommonRemocon {
    // [Remocon <-, SamsungRemocon]
    // [Remocon <-, LgRemocon]
    private Remocon r; // 인터페이스 or 추상클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on() {
        r.on(); // [Remocon <-, SamsungRemocon]
    }

    public void off() {
        r.off();
    }
}

class JoohoRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("주호 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("주호 리모콘 off");
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new JoohoRemocon());
        cr.off();
    }
}
