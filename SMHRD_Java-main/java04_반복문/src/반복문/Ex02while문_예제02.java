package 반복문;

import java.util.Scanner;

public class Ex02while문_예제02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //  특정한 값을 누적시켜서 출력해야한다 -> 0으로 초기화된 변수 선언
		int num = 0;
		
		while(num!=-1) {
		sum += num; // sum = sum+sum; // sum에 num값을 누적(더해줌)	
		System.out.print("숫자입력: ");
		num = sc.nextInt();
		}
		System.out.print("누적결과: " + sum);
		
		
		while(true) {
			sum += num; // sum = sum+sum; // sum에 num값을 누적(더해줌)	
			System.out.print("숫자입력: ");
			num = sc.nextInt();			
			
			if(num==-1) {
				break;
			}
		}
		
	}

}
