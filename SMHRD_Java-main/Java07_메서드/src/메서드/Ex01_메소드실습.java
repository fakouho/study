package 메서드;

import java.util.Scanner;

public class Ex01_메소드실습 {

	public static void main(String[] args) {
		
//		Q1. 키보드로 입력 받은 두개의 정수를 인자(매개변수)로 
//		    넘겨받아 첫번째 수에서 두번째 수를 뺀 수를 출력하는 메소드
//		    getMinusVal()을 작성하시오
		
//		매개변수 - int(2개)
//		반환값 : 출력하고 끝날거면 없어도 됨, 출력하고 반환해줄거야-> 반환값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		int num2 = sc.nextInt();
		
		//static 메서드 내에서 non-static 호출-> 불가능
		//non-static 메서드를 호출하려면 -> 객체, 인스턴스 생성후 호출
		getMinusVal(num1, num2);
	}
	
	//static을 지우면 non-static
	//접근제한자 정적(static) 반환타입 메서드이름(){}
	private static void getMinusVal(int a, int b) {

		System.out.println("결과 : " + (a-b));
		
	}

}
