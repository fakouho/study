package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(10);
		int sum = 0;
		int correct = 0;
		int incorrect = 0;

		while (true) {
			System.out.print(num1 + "+" + num2 + "=");
			sum = sc.nextInt();

			if (num1 + num2 == sum) {
				System.out.println("Success!");
				correct++;
				num1 = rd.nextInt(10);
				num2 = rd.nextInt(10);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
			} else {
				System.out.println("Fail!");
				incorrect++;
			}
			System.out.print("계속 하시겠습니까? : ");
			String y_n = sc.next();

			if (y_n.equals("n") || y_n.equals("N")) {
				System.out.println("종료!");
				
				System.out.println("맞춘개수 : " + correct);
				System.out.println("틀린개수 : " + incorrect);
				
				break;
			} 
			
		}
		
		

		

//		do {
//			System.out.print(num1 + "+" + num2 + "=");
//			sum = sc.nextInt();
//
//			if (num1 + num2 == sum) {
//				System.out.println("Success!");
//				correct++;
//				num1 = rd.nextInt(10);
//				num2 = rd.nextInt(10);
//			} else {
//				System.out.println("Fail!");
//				incorrect++;
//
//			}
//			System.out.print("계속 하시겠습니까? : ");
//			String y_n = sc.next();
//
//			if (y_n.equals("n") || y_n.equals("N")) {
//				System.out.println("종료!");
//				break;
//			}
//
//		} while (true);
//
//		System.out.println("맞춘개수 : " + correct);
//		System.out.println("틀린개수 : " + incorrect);
	}

}