package 조건문;

import java.util.Scanner;

public class Ex05_ifelse조건문예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 : ");
		int sw = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int sw2 = sc.nextInt();
		System.out.print("데이터베이스 구축 입력 : ");
		int db = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int pro = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int info = sc.nextInt();
		
		int sum = sw+sw2+db+pro+info;
	
		if(sw<8||sw2<8||db<8||pro<8||info<8||sum<60) {
			System.out.println("불합격입니다."); 
		} else {
			System.out.println("합격입니다.");
			}
			
		}
	}

