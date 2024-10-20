package 메서드;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		int num2 = sc.nextInt();

		int result = getAbsoluteVal(num1, num2);

		System.out.println("결과: " + result);
	}

	// 매개변수, 반환값 뭐가 필요한지 확인
	// 매개변수 : 두개의 정수 (int 2개)
	// 반환타입 : 정수(int)

	private static int getAbsoluteVal(int a, int b) {

//		int result = a + b;

		int result = (a >= b) ? a - b : (a - b) * -1; //
		// System.out.println("결과: " + (a-b));

		return result;
//		return Math.abs(a-b);

	}

}
