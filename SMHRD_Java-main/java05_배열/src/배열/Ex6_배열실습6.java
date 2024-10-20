package 배열;

import java.util.Scanner;

public class Ex6_배열실습6 {

	public static void main(String[] args) {
		
		//점수 입력 받는 함수
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력	
		int [] score = new int[5];
					
		for(int i = 0; i<score.length; i++) {				
			System.out.print((i+1) + "번째 입력>>");
			score[i] = sc.nextInt();		
		} 
				
		//입력된 점수 출력하기
		System.out.print("입력된 점수 >> ");
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+ "\t");
		}
		
		// 최고점수, 최저점수, 총합, 평균 
		// 배열 데이터값이 입력된 후 초기화 해야함 
		int max = score[0]; 
		int min = score[0];
		
		int sum = 0;
		int avg = 0;
		
		// 최고점수, 최저점수 구하기
		for(int i = 0; i<score.length; i++) {
			if(max>score[i]) {
				//맥스보다 큰 데이터 값 대입
				max = score[i];
			}
			if(min<score[i]) {
				//민보다 작은 데이터 값 대입 
				min = score[i];
			}
		// 총합과 평균 구하기	
			sum += score[i];
			avg = sum/score.length;
		}
		
		System.out.println("");
		System.out.println("최저점수" + max);
		System.out.println("최고점수" + min);	
		System.out.println("총합" + sum);	
		System.out.println("평균" + avg);	
		
//		System.out.print("1번째 입력>>");
//		int score1 = sc.nextInt();
//		System.out.print("2번째 입력>>");
//		int score2 = sc.nextInt();
//		System.out.print("3번째 입력>>");
//		int score3 = sc.nextInt();
//		System.out.print("4번째 입력>>");
//		int score4 = sc.nextInt();
//		System.out.print("5번째 입력>>");
//		int score5 = sc.nextInt();
		
		//입력된 점수중 최고 점수와 최저 점수 출력
//		int min = 0;
//		int max = 0;
//		if(min > )
//	
		
		
		

	}

}
