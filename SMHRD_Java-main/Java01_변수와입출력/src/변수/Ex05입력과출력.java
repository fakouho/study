package 변수;

import java.util.Scanner;

public class Ex05입력과출력 {

	public static void main(String[] args) {
	
//		 Scanner sc = new Scanner(System.in);
//		  
//		 System.out.printf("이름 : "); 
//		 String name = sc.next();
//		 
//		 System.out.printf("나이 : "); 
//		 String age = sc.next();
//		
//		 System.out.println("이름은 "+name+"이고 "+"나이는 "+age+"입니다.");


		Scanner sc = new Scanner(System.in); // 입력도구 생성

		System.out.print("이름 : ");
		String name = sc.next(); // 문자열형으로 돌려줌
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 정수형으로 돌려줌
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다.");
		System.out.printf("이름은 %s이고 나이는 %d입니다.", name, age);
		
	

	}

}
