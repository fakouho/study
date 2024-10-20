package 반복문;

import java.util.Scanner;

public class Ex05while문_예제05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String id = "smhrd";
//		String password = "1234";
//		
//		int count = 1;
//		
//		while(count<=3) {
//			count++;
//			System.out.print("아이디: ");
//			String id2 = sc.next();
//			
//			if(id.equals(id2)) {
//				System.out.print("비밀번호: ");
//				String password2 = sc.next();
//				
//				if(password.equals(password2)) {
//					System.out.println("로그인 성공");				
//				}else {
//					System.out.println("로그인 실패");							
//				}
//					
//				break;	
//				
//			} else {
//				System.out.println("로그인 실패");
//				
//			}
//			
//			
//		}
		
		String id = "";  //  String 초기화 : null(빈값 - primitive type), ""
		String pw = "";
		
		String y_n = ""; // Y/N
		
		int cnt = 0; // 틀린횟수 카운팅
		
		do {
			System.out.print("아이디: ");
			id = sc.next();
			System.out.print("비밀번호: ");
			pw = sc.next();
			
			if(id.equals("smhrd")&&pw.equals("1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");	
				
				cnt++;
				
				if(cnt==3) {
					System.out.println("본인인증을 해주세요");
					break;
				}
				
				System.out.print("계속 하시겠습니까? ");
				y_n = sc.next();
				
				if(y_n.equals("N")||y_n.equals("n")) {
					break;
				}
			}
			
		}while(!id.equals("smhrd")||!pw.equals("1234"));
		//string 끼리 비교시 동일하지 않는 경우 : !(not)를 비교구문 앞에 작성
		
		

	}

}
