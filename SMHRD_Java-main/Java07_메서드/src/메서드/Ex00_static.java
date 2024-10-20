package 메서드;

import java.util.Random;

public class Ex00_static {

	public static void main(String[] args) {

		//non-static 메서도 : 참조값을 알아야 호출할 수 있는 메서드
		//랜덤 도구(객체, 인스턴스) 생성 - new 키워드 사용
		Random rd = new Random();
		//생성한 도구의 참조값을 알고 있어야지만 사용가능
		rd.nextInt();
//		Random.nextInt(); X
		
		//Math 클래스의 abs 메서드 사용
		//abs: static 메서드
		//new 키워드 x -> 객체, 인스턴스 생성 x -> 바로 사용가능
		//랜드마크
		Math.abs(2);

	}

}
