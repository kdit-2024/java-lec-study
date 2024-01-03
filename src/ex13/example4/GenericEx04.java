package ex13.example4;

class Model {

    private static Model instance = new Model();

    public static Model getInstance() {
        return instance;
    }

    private Model() {
    }

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
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

public class GenericEx04 {
    public static void main(String[] args) {
        Model m = Model.getInstance();
        User u = new User();
        m.setData(u);

        User ob = (User) m.getData();
        ob.hello();
    }
}
