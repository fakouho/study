package Animal;

public class Dog extends Animal {
	// 필드 : 종 -> Animal
	// 메서드 : 재주부리다, (울다("멍멍"), 뛰다) -> Animal

	public void skill() {
		System.out.println("공물어오기!");
	}

	// 오버라이딩 : 상위클래스의 메소드 중 재정의해야하는 기능이 있을 때
	// 하위클래스에서 매개변수의 개수, 타입, 순서, 반환타입은 동일하게 메서드 재정의 하는 것
	// (동적바인딩: 실행(런타임) 성격 결정) <-> (정적바인딩: 컴파일시 성격 결정)
	// 동적바인딩 ex : 실제로 참조하는 객체는 서브클래스이니 서브클래스의 메소드를 호출
	// 정적바인딩 ex : 업캐스팅(Dog->Animal) - 타입이 슈퍼클래스일 때 슈퍼클래스 메소드 호출
	public void cry() {
		System.out.println("멍멍!");
	}

}
