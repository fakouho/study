package 조건문;

import java.util.Scanner;

public class Ex01조건문_예제02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if((num%3==0) || (num%5==0)) {		
			System.out.println("3 또는 5의 배수입니다.");
		}
		System.out.println("3 또는 5의 배수가 아닙니다.");

	}

}
