package ex06.example5;

abstract class 판사 { // Object가 아니다.
    public abstract void 심문();
}

abstract class 증인 {
    public abstract void 대답();
}

class 왕 extends 판사 {
    public void 심문() {
        System.out.println("왕은 심문한다");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다");
    }
}

class 엘리스 extends 증인 {

    @Override
    public void 대답() {
        System.out.println("엘리스는 대답한다");
    }
}


class 호랑이 extends 증인 {
    public void 대답() {
        System.out.println("호랑이는 대답한다");
    }
}

class 고양이 extends 증인 {

    @Override
    public void 대답() {
        System.out.println("고양이는 대답한다");
    }
}


class Game {

    public void 심문(판사 u1) {
        u1.심문();
    }

    public void 대답(증인 u1) {
        u1.대답();
    }

}


public class AliceApp {
    public static void main(String[] args) {
        왕비 u1 = new 왕비();
        모자장수 u2 = new 모자장수();
        왕 u3 = new 왕();
        토끼 u4 = new 토끼();
        엘리스 u5 = new 엘리스();
        호랑이 u6 = new 호랑이();
        고양이 u7 = new 고양이();

        Game game = new Game();
        game.심문(u3);
        game.대답(u7);
    }
}
