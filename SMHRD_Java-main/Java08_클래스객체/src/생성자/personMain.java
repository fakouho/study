package 생성자;

public class personMain {

	public static void main(String[] args) {
		// person(객체, 인스턴스) 생성
		// person 객체의 참조값을 저장하고 있는 레퍼런스 변수 선언
		Person p = new Person(); // Person 타입의 객체 생성

		p.setName("한수진");
		p.setAge(20);

		System.out.print(p.getName());
		System.out.print(p.getAge());
		
		
		
		Person p1 = new Person("강예진", 23);
		System.out.print(p1.getName());
		System.out.print(p1.getAge());

	}

}
