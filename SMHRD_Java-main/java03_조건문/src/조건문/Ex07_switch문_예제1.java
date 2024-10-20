package 조건문;

import java.util.Scanner;

public class Ex07_switch문_예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		
		switch(data) {
		case "한국어" :
			System.out.println("안녕하세요");
			break;
		case "영어" :
			System.out.println("헬로");
			break;
		case "중국어" :
			System.out.println("니하오");
			break;
		case "일본어" :
			System.out.println("곤니찌와");
			break;
		default :
			System.out.println("다른값 입력하세요");			
		} 

	}

}
