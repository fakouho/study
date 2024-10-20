package 변수;

public class Ex01변수 {

	public static void main(String[] args) { // 프로그램이 시작하는 시점

		// 변수: 데이터를 담을 수 있는 공간(값 변경 가능)
		// 변수 선언
		int num; // 자료형 변수이름;
		// 자료형: 변수가 담을 자료(데이터)의 형태(정수형, 실수형, 문자형, 논리형...)
		// 변수이름: 원하는 대로 작성 가능(but, 에약어는 사용불가능, 규칙 지켜줘야함)
		// int class; 주석처리 단추키: ctrl+/, 여러줄 ctrl+shift+/

		// 변수에 값을 할당
		num = 3; // 변수이름 = (대입연산자) 할당할 값

		// 변수이름 일괄변경 단축키: alt+shift+r
		int num123 = 2; // 변수 선언과 동시에 값 할당
		System.out.print(num123);
		num123 = 3; // 값 재할당
		System.out.print(num123); // 실행: ctrl+f11
		// 코드 복사: ctrl+alt+방향키
		// 코드 정리: ctrl+shift+f

		// 상수 : 데이터를 담을 수 있는 공간(값 변경 불가능), final 키워드 사용
		final int num3 = 10;
		// num3 = 20;  상수는 값 변경 불가능
		// 코드 옮기기 단축기: alt+방향키

		//변수명은 대소문자 구분
		//같은 클래스내에서 같은 변수명 선언(재선언) 불가능
		int num4;
		//int num4;
		int Num4;

	}

}
