package 배열;

import java.util.Scanner;

public class Ex04배열예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] aw_arr = { 1, 4, 3, 2, 1 }; // 실제 답
		int[] aw = new int[5]; // 사용자가 입력한 답을 저장
		char[] ox = new char[5];
		int cnt = 0; // 맞은거 카운팅

		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");

		int i = 0;

		for (i = 0; i < aw.length; i++) {
			System.out.print((i + 1) + "번답 >> ");

			aw[i] = sc.nextInt();
		}

		for (i = 0; i < aw_arr.length; i++) {
			if (aw_arr[i] == aw[i]) {
				ox[i] = 'O';
				cnt++;
			} else {
				ox[i] = 'X';
			}
		}

		System.out.println("정답확인");

		for (i = 0; i < ox.length; i++) {
			System.out.print(ox[i] + " ");
		}
		System.out.print("총점: " + (cnt * 20));
	}
}

