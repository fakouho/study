package 변수;

import java.util.Scanner;

public class Ex04입력문 {

	public static void main(String[] args) {
		
		//System.in: 키보드로 입력할 수 있도록 해주는 도구
		//Scanner: 입력받은 값을 사용할 수 있도록 해주는 도구
		
		Scanner sc = new Scanner(System.in); // 스캐너 도구 생성(메모리 상의 주소) 
		
		//String s = sc.next(); // 입력한 값을 돌려줌
		//next(): 공백을 기준으로 분리 
		//System.out.println(s);
		//sc.next();
		
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		int num = sc.nextInt();
		System.out.println(num);
	

	}

}
