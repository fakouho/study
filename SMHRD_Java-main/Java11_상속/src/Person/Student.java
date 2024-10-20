package Person;

public class Student extends Person{
	
	String stdId = "123";
	String grage;
	
	//Student 객체 생성할 때 String 타입의 매개변수 하나 받겠다.
	public Student(String name) {
		//매개변수로 받은 값을 슈퍼클래스(부모클래스)의 생성자 호출시 사용
		super(name);
	}
	
	public void walk() {
		System.out.println("걸어서 집간다");
	}
	

}
