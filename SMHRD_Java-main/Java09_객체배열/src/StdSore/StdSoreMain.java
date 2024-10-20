package StdSore;

import java.util.Scanner;

public class StdSoreMain {

	public static void main(String[] args) {
		// stdScore 객체 레퍼런스 변수 선언

		StdScore[] std_arr = new StdScore[3];

		Scanner sc = new Scanner(System.in);
		
			
		for(int i=0; i < std_arr.length; i++) {
			
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			
			System.out.print((i + 1) + "번째 학생의 Java점수를 입력하세요 >> ");
			int scoreJava = sc.nextInt();
			
			System.out.print((i + 1) + "번째 학생의 Web점수를 입력하세요 >> ");
			int scoreWeb = sc.nextInt();
			
			System.out.print((i + 1) + "번째 학생의 Android점수를 입력하세요 >> ");
			int scoreAndroid = sc.nextInt();
			
			std_arr[i] = new StdScore(name, scoreJava, scoreWeb, scoreAndroid);
			
		}
		
		for(int i=0; i < std_arr.length; i++) {
			
			int total = 0;
			
			total += std_arr[i].getScoreJava();
			total += std_arr[i].getScoreWeb();
			total += std_arr[i].getScoreAndroid();
			
			System.out.println(std_arr[i].getName() + "의 총점은" + total + "점," + "평균은" + (total / 3) + "입니다.");
		}
		
		
		
		
		
		

//		for (int i = 0; i < std_arr.length; i++) {
//			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요. >> ");
//			String name = sc.next();
//
//			System.out.print((i + 1) + "번째 학생의 Java점수를 입력하세요 >> ");
//			int scoreJava = sc.nextInt();
//
//			System.out.print((i + 1) + "번째 학생의 Web점수를 입력하세요 >> ");
//			int scoreWeb = sc.nextInt();
//
//			System.out.print((i + 1) + "번째 학생의 Android점수를 입력하세요 >> ");
//			int scoreAndroid = sc.nextInt();
//
//			std_arr[i] = new StdScore(name, scoreJava, scoreWeb, scoreAndroid);
//		}
//
//		int sum = 0;
//
//		for (int i = 0; i < std_arr.length; i++) {
//
//			sum = std_arr[i].getScoreJava() + std_arr[i].getScoreWeb() + std_arr[i].getScoreAndroid();
//
//			System.out.println(std_arr[i].getName() + "의 총점은" + sum + "점," + "평균은" + (sum / 3) + "입니다.");
//		}

	}

}
