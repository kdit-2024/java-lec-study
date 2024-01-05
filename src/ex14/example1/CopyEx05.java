package ex14.example1;

import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO {
    private String username; // ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Member {
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;

    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = LocalDateTime.now();
    }
}


public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
    }
}
