package 연산자;

import java.util.Scanner;

public class Ex03산술연산자_예제09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int scorejava = sc.nextInt();
		System.out.print("WEB 점수 입력 : ");
		int scoreweb = sc.nextInt(); 
		System.out.print("ANDROID 점수 입력 : ");
		int scoreandroid = sc.nextInt(); 
		
		int sum = scorejava + scoreweb + scoreandroid;
		double div = (double)sum/3;
		
		System.out.println("합계 : " + sum );
		System.out.printf("평균 : %.2f", div);
		System.out.printf("평균 : %.2f", sum/3.0);


		

	}

}
