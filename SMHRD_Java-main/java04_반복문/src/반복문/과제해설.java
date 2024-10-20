package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 과제해설 {

	public static void main(String[] args) {
		// 랜덤수를 뽑을 수 있게 도와주는 도구
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// rd.nextInt(10); : 0~9 수를 랜덤으로 뽑아줌
		// rd.nextInt(10)+1; : 0->1 1->2 9->10
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;

		int o = 0; // 맞춘개수
		int x = 0; // 틀린개수

		while (true) {
			System.out.printf("%d + %d =", num1, num2); // 랜덤 수 나오는지 확인
			int input = sc.nextInt(); // 사용자가 답을 입력하는 부분

			if (input == num1 + num2) { // 맞는답을 입력한 경우
				System.out.println("Success!");
				o++;
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
			} else { // 틀린답을 입력한 경우
				System.out.println("Fail");
				x++;
			}
			System.out.print("계속히시겠습니까?");
			String con = sc.next();

			if (con.equals("N")) {
				System.out.println("종료!");
				break; // 가장 가까운 반복문을 나가게 하는 키워드
			}
		}
		System.out.println("맞춘개수 : " + o);
		System.out.println("틀린개수 : " + x);
	}
}