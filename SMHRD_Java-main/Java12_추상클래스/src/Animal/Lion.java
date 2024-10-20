package Animal;

public class Lion extends Animal {
	//필드: 눈, 귀, 꼬리
	// 메서드 : 움직이다, 공격하다, 자다
	boolean tail;
	// 상위클래스인 추상클래스의 추상메서드를 무조건 재정의하도록 강제성 부여
	// 하기위해서 추상메서드 사용!
	public void sleep(){
		System.out.println("사자자다");
	}
	
	@Override
	public void move() {
		System.out.println("사자움직임");

	}
	//주석(annotation) : 특별한 기능(컴파일할 때 해당 메서드가
	// 상위클래스의 메서드를 재정의한 메서드인지 확인)을 가진 주석 
	@Override
	public void attack() {
		System.out.println("사자공격");


	}

}
