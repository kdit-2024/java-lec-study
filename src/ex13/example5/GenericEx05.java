package ex13.example5;


class Model<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class User {
    public int id = 1;
    public String name = "홍길동";
    public String email = "ssar@nate.com";

    public void hello() {
        System.out.println("안녕하세요");
    }
}

public class GenericEx05 {
    public static void main(String[] args) {
        Model<User> m = new Model();
        m.setData(new User());

        User u = m.getData();
        u.hello();
    }
}
