package 배열;

import java.util.Scanner;

public class Ex8_IDPW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;

		// 1.회원가입/로그인/종료 메뉴 출력 후 사용자가 선택
		// 2.종료 선택하기 전까지 계속 메뉴 선택, 종료 선택 프로그램 종료
		// 3. 회원가입 기능
		// 3-1. 사용자가 아이디/비밀번호 입력 -> 기억(저장) 3명까지 가입 가능
		// 변수 / 배열(자료 개수, 개수 2개이상)

		String[] id_arr = new String[3]; // 아이디 저장 배열
		int[] pw_arr = new int[3]; // 비밀번호 저장 배열
		int cnt = 0; // 회원 가입한 사람의 수를 카운팅

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			menu = sc.nextInt(); // 사용자가 메뉴 선택
			
			while (cnt < 3) {				
			if (menu == 1) {
				// System.out.println("회원가입");
				System.out.println("==회원가입==");
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				int pw = sc.nextInt();

				id_arr[cnt] = id;
				pw_arr[cnt] = pw;

				cnt++; // 두번째 회원가입 하는 사람은 각 배열의 1번 인덱스에 저장
				
			} else if (menu == 2) {
				//System.out.println("로그인");
				System.out.println("==로그인==");				
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				int pw = sc.nextInt();
				//입력값 - 배열에 저장된 값을 비교
				
				int i = 0; // 로그인 실패를 알수 있는 변수(3이되면 ->실패)
				for (i = 0; i < id_arr.length; i++) {
					if (id_arr[i] != null) {
						if (id_arr[i].equals(id) && pw_arr[i] == pw) {
							System.out.print("로그인 성공");
							break;
						}
					}
				}
				if(i==3) {
					System.out.println("로그인실패");
				}
//				if(id_arr[1].equals(id)&&pw_arr[1]==pw) {
//					System.out.print("로그인 성공");					
//				}
//				
//				if(id_arr[2].equals(id)&&pw_arr[2]==pw) {
//					System.out.print("로그인 성공");					
//				}
				
								
			} else if (menu == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("1,2,3중에 입력해주세요");
			}

		}
		
		//회원 가입된 회원 정보 확인(배열에 값을 출력) 
//		for(int i=0; i<id_arr.length; i++) {
//			System.out.println(id_arr[i]);
//			System.out.println(pw_arr[i]);
//		}
//		
//		//확장for문(배열/arraylist 사용 시 값 확인할 때 사용하기 좋은 구조)
//		//(for~each문)
//		for(String s:id_arr) {
//			System.out.println(s);			
//		}

	}

}
}
