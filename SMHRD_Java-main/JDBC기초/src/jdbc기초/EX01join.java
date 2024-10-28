package jdbc기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EX01join {

    public static void main(String[] args) { // 메서드 이름 수정
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===회원가입===");

        Connection conn = null; // Connection으로 수정
        PreparedStatement psmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/test"; // 데이터베이스 이름 수정
            String user = "root";
            String password = "1234";

            // 데이터베이스 연결
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("연결 성공!");
            } else {
                System.out.println("연결 실패");
                return; // 연결 실패 시 메서드 종료
            }

            // 사용자 입력 받기
            System.out.print("아이디: ");
            String id = sc.nextLine();
            System.out.print("비밀번호: ");
            String pw = sc.nextLine();
         
   
          
            // SQL 쿼리 준비
            String sql = "INSERT INTO test2 (username, password) VALUES (?, ?, ?, ?, ?)";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);
           

            // 쿼리 실행
            int row = psmt.executeUpdate();
            if (row > 0) {
                System.out.println("회원가입 성공!");
            } else {
                System.out.println("회원가입 실패.");
            }
        } catch (Exception e) {
            e.printStackTrace(); // 예외 출력
        } finally {
            // 자원 해제
            try {
                if (psmt != null) psmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sc.close(); // Scanner 자원 해제
    }
}
