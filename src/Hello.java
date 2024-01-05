// 1. 리턴 타입이 void이 경우
// 2. 매개변수가 있는 경우
// 3. 리턴 타입이 있는 경우
interface Able<T, R> {
    R hello(T value);
}


public class Hello {

    static void start(Able able) {
        able.hello(1);
    }

    public static void main(String[] args) {
        start(value -> 10);
    }
}
