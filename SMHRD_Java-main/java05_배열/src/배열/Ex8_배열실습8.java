package 배열;

import java.util.Scanner;

public class Ex8_배열실습8 {

	public static void main(String[] args) {
		// 입력도구 불러오기
		Scanner sc = new Scanner(System.in);

		// id와 pw가 저장될 공간을 만들어주자
		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int cnt = 0;

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3] 종료 >> ");
			int num = sc.nextInt();

			// 1을 입력 받았을 때
			if (num == 1) {
				// 3번만 회원가입 할 수 있도록 조건을 설정
				// 회원가 가입 횟수를 cnt로 알 수 있음
				while (cnt < 3) {
					System.out.println("==회원가입==");
					System.out.print("아이디 입력: ");
					id_array[cnt] = sc.next();
					System.out.print("비밀번호 입력: ");
					pw_array[cnt] = sc.next();

					cnt++;

					break;
				}

				// 2를 입력 받았을 때
			} else if (num == 2) {
				System.out.println("==로그인==");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				// id와 pw배열 접근하기 -> 내가 입력한 아이디와 비밀번호가 배열에 있는지 확인하기 위해
				for (int i = 0; i < id_array.length; i++) {
					for (int j = 0; j < pw_array.length; j++) {
						// .equals() -> 문자가 같은지
						// == -> 숫자 비교
						if (id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if (i == j) {
								// 인덱스 값도 같아야 로그인 성공
								System.out.println("로그인 성공!!");
								break;
							}
						} else {
							System.out.println("로그인 실패...");
							break;
						}
						break;
					}
					break;

				}

			} else if (num == 3) {
				// 3입력 받았을 때
				System.out.println("종료");
				break;
			}

			/*
			 * while (true) {
			 * 
			 * System.out.print("[1]회원가입 [2]로그인 [3] 종료 >> "); int num = sc.nextInt();
			 * 
			 * String[] id_array = new String[3]; String[] pw_array = new String[3];
			 * String[] input_id = id_array; String[] input_pw = pw_array;
			 * 
			 * 
			 * if (num == 1) { for (int i = 0; i<3; i++) { System.out.print("아이디입력 :");
			 * id_array[i] = sc.next(); System.out.print("비밀번호입력 :"); pw_array[i] =
			 * sc.next(); System.out.println("가입성공"); } input_id[i] = id_array[i];
			 * input_pw[i] = pw_array[i];
			 * 
			 * else if () {
			 * 
			 * 
			 * }
			 * 
			 * System.out.print("아이디 입력"); input_id[1] = sc.next();
			 * System.out.print("비밀번호입력 :"); input_pw[1]= sc.next();
			 * 
			 * else if(!input_id[1].equals(id_array[1])||!input_pw[1].equals(pw_array[1])) {
			 * System.out.println("로그인 실패");}
			 * 
			 * System.out.println("로그인성공"); }
			 * 
			 * } else if(num==3) {
			 * 
			 * }
			 */

		}

	}
}
