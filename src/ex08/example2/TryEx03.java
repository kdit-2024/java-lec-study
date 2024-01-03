package ex08.example2;

// 약속 : 1은 정상, 2는 id 제약조건 실패, 3은 pw 제약조건 실패
// 책임 : 데이터베이스 상호작용
class Repository {
    int insert(String id, String pw) {
        System.out.println("레포지토리 insert 호출됨");
        if (id.length() < 4) {
            return 2;
        }
        if (pw.length() > 50) {
            return 3;
        }
        return 1;
    }
}

// 책임 : 유효성 검사
class Controller {
    String join(String id, String pw) {
        System.out.println("컨트롤러 회원가입 호출됨");
        if (id.length() < 4) {
            return "유효성검사 : id의 길이가 4자 이상이어야 합니다.";
        }

        Repository repo = new Repository();
        int code = repo.insert(id, pw);

        if (code == 2) {
            return "id가 잘못됐습니다";
        }

        if (code == 3) {
            return "pw가 잘못됐습니다";
        }

        return "회원가입이 완료되었습니다";
    }
}

public class TryEx03 {
    public static void main(String[] args) {
        Controller con = new Controller();
        String message = con.join("ssar", "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789");
        System.out.println(message);
    }
}
