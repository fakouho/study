package 반복문;

import java.util.Scanner;

public class Ex12for문_예제05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 약수는");
		
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
