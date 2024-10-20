package Animal;

public class AnimalMain {

	public static void main(String[] args) {

		Animal a1 = new Animal();

		Dog a2 = new Dog();

		Cat a3 = new Cat();

		// 오버라이딩된 메서드 호출(동적바인딩)
		a1.cry();
		a2.cry();
		a3.cry();

	}

}
