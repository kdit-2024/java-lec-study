package ex06.example4;

public class StarApp {

    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack();
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1"); // [Zealot, Protoss]
        Dragoon d1 = new Dragoon("d1"); // [Dragoon, Protoss]
        River r1 = new River("r1"); // [River, Protoss]
        Dark dark1 = new Dark("dark1"); // [Dark, Protoss]
        Carrier c1 = new Carrier("c1");
        Scout s1 = new Scout("s1");

        gameStart(z1, s1);
        gameStart(s1, dark1);

        gameStart(z1, d1);
        gameStart(dark1, d1);

        gameStart(c1, z1);
    }
}
