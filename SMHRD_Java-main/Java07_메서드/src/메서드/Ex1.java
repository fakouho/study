package 메서드;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// 입력받는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = largerNumber(num1, num2);
		System.out.print("더 큰 수는?");
		
	}
	
	//largerNumber메서드
	public static int largerNumber(int num1, int num2) {

		// num1이 num2보다 큰지 작은지 판단
		// 조건문으로 쓰거나 
		// 코드를 한줄로 줄이면 삼항연산자로 가능
				
		int result = (num1 > num2)? num1 : num2;
		
//		int result = 0;
		
//		if(num1>num2) {
//			result =  num1;
//		}else {
//			result = num2;
//		}
		
		return result;
	}

}
