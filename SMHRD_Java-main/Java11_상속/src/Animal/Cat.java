package Animal;

public class Cat extends Animal {

	public void groom() {
		System.out.println("그루밍중!");
	}

	// 주석(annotation) : 특별한 기능을 가진 주석
	// 컴파일할 때 오류를 확인할 수 있게
	@Override
	public void cry() {
		System.out.println("미야옹!");
	}

}
