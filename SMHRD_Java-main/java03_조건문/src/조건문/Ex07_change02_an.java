package 조건문;

import java.util.Scanner;

public class Ex07_change02_an {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();

		// 전역변수
		int change = 0; // 변수선언
		// 값을 초기화 : int -> 0 // String -> ""

		if (menu == 1) {
			change = money - 1800;
		} else if (menu == 2) {
			change = money - 2000;
		} else if (menu == 3) {
			change = money - 1200;
		}

		if (change >= 0) {
			System.out.println("잔돈 : " + change + "원");

			int a = change / 1000;
			int b = (change % 1000) / 500;
			int c = (change % 500) / 100;

			System.out.println("천원 : " + a);
			System.out.println("오백원 : " + b);
			System.out.println("백원 : " + c);

		} else {
			System.out.print("돈이 부족해요 ㅠㅠ");
		}

	}

}
