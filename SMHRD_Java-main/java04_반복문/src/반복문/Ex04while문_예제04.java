package 반복문;

import java.util.Scanner;

public class Ex04while문_예제04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		System.out.print("현재 몸무게 : ");
		a = sc.nextInt(); // 현재 몸무게
		System.out.print("목표 몸무게 : ");
		b = sc.nextInt(); // 목표 몸무게

		int week = 0;
		int c = 0;

		while (true) {
			week++;
			System.out.print(week + "주차 감량 몸무게: ");
			c = sc.nextInt(); // 감량 몸무게
			a = a - c;
			
			if (a <= b) {
				System.out.println("최종 몸무게 : " + a);
				System.out.print("축하합니다!");
				break; // break: 만나는 즉시 가장 가까운 반복문 나감
			}
		
		}
		
//		System.out.print("현재 몸무게 : ");
//		int cur = sc.nextInt(); // 현재 몸무게
//		System.out.print("목표 몸무게 : ");
//		int goal = sc.nextInt(); // 목표 몸무게
//		
//		int week2 = 1;
//		int weight = 0;
//		
//		
//		while(cur>goal) { //반복을 할 조건
//			System.out.print(week2 + "주차 감량 몸무게 : ");
//			weight = sc.nextInt();
//			week2++;
//			cur -= weight;			
//		}
//		
//		System.out.println("최종 몸무게 : " + cur);
//		System.out.print("축하합니다!");
		
	}

}
