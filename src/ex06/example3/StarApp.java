package ex06.example3;

public class StarApp {

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d1");
        Zealot z2 = new Zealot("z2");

        gameStart(z1, d1);
        gameStart(d1, z1);
        gameStart(z1, z2);
        gameStart(z2, z1);
    }
}
