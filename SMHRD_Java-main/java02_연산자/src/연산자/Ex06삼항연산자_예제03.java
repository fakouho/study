package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자_예제03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int minus1 = num1-num2;
		int minus2 = num2-num1;
		
		int result = (num1>num2? minus1 : minus2);
		
		System.out.println("두 수의 차 : " + result);
		
		
		
	}

}
