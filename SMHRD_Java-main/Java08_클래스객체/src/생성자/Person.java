package 생성자;

public class Person {

	// 필드 : 이름, 나이
	private String name;
	private int age;

	public Person() { // 기본생성자 구조

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public Person(String name) {
		// super(); 
		this.name = name;
	}

	// Alt + Shift + S => Generate getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}//hello!
