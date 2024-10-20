package 반복문;

import java.util.Scanner;

public class Ex13for문_예제06 {

	public static void main(String[] args) {

		// 1~50까지 숫잘로 369게임 만들기
		// 369일때, "박수", 일의자리가 5일때는"으악"
		for(int i = 1; i<=50; i++) {
			if((i%10 == 3 || i%10 == 6 || i%10 == 9)) {	
				System.out.println("박수");
					} else if(i%10 == 5) {
				System.out.println("으악");
					}else {
						System.out.println(i);
					}
				
			}
		
			
	}

}




