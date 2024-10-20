package 조건문;

import java.util.Scanner;

public class Ex06_다중if문_예제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액: ");
		int num = sc.nextInt();
		System.out.print("성인/청소년/어린이: ");
		String str = sc.next();
		
				
		if(str.equals("성인") && num>=1800) {
			System.out.println("감사합니다");
		}else if(str.equals("청소년") && num>=1500) {
			System.out.println("반갑습니다");			
		}else if(str.equals("어린이") && num>=1000) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}

}
