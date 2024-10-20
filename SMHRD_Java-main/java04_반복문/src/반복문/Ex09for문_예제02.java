package 반복문;

import java.util.Scanner;

public class Ex09for문_예제02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Q. 정수 1개를 입력받아 1부터 입력받은 정수까지 차례대로 출력해주는 프로그램을 작성하시오
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {			
			System.out.print(i+" ");
		}



	}

}
