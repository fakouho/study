package 연산자;

import java.util.Scanner;

public class Ex05삼항연산자_예제02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int result = num/2;
		
		System.out.println((result==0)? "짝수입니다" : "홀수입니다");
		
//		String result = (num%2==1)?"홀수":"짝수";
//		System.out.println(num+"는(은)"+result+"입니다.");
		

	}

}
