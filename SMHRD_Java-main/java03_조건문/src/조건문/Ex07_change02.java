package 조건문;

import java.util.Scanner;

public class Ex07_change02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();
		
		int change1 = money - 1800;
		int change2 = money - 2000;
		int change3 = money - 1200;
		
		if(menu==1 && money>=1800) {
			System.out.print("잔돈 : " + change1 + "원");
		}else if (menu==2 && money>=2000) {
			System.out.print("잔돈 : " + change2 + "원");
		}else if (menu==3 && money>=1200) {
			System.out.print("잔돈 : " + change3 + "원");
		}else {
			System.out.println("돈이 부족해요 ");
		}
	
	}

	}

