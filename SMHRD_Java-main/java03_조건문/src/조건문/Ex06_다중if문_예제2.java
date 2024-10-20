package 조건문;

import java.util.Scanner;

public class Ex06_다중if문_예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력하시오: ");
		String str = sc.next();
		
		//비교연산자 -> 기본타입 비교할 때 사용
		//문자열끼리 비교 할 때 equals 사용
		if(str.equals("A")) {
			System.out.println("A입력");
		}else if(str.equals("B")) {
			System.out.println("B입력");
		}else if(str.equals("C")) {
			System.out.println("C입력");
		}else{
			System.out.println("A,B,C 외 입력");
			}
		
	}
}


