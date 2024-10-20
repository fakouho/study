package Person;

public class PersonMain {

	public static void main(String[] args) {

		Student s1 = new Student("춘식이");

		System.out.println(s1.getName());
		System.out.println(s1.stdId);

		s1.walk();

		// 업캐스팅 : 하위클래스의 객체를 상위클래스로 형변환(자동) 하는 것
		// 업캐스팅이 되었을 때는 그 전 상태(하위클래스)의 객체 맴버에는
		// 접근 할 수 없음 단, 오버라이딩 된 경우에는 하위클래스 메서드 호출

		Person p = s1; // s1은 p로 업캐스팅 된 상태 (부모가 된 상태)
		p.walk(); // 하지만 본질은 남아있음 // 오버라이딩 된 상태
		// System.out.println(p.stdId);

		Student p1 = new Student("라이언");
		Teacher p2 = new Teacher("어피치");
		// 서로 타입이 다르기 때문에 배열이나 리스에 담을 수 없음
		// Student, Teacher -> 모두 Person

		Person ps1 = p1;
		Person ps2 = p2;

		Person[] p_arr = new Person[2];

		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for (Person person : p_arr) {
			person.walk();
		}

		// 업캐스팅 된 상태에서 원래 어떤 타입이었는지 알고 싶을 때 사용하는 연산자
		// ->instanceof -> true / false
		System.out.println(ps1 instanceof Student); // true
		System.out.println(ps1 instanceof Teacher); // false

		// 다운캐스팅 : 업캐스팅된 객체를 원래 타입으로 다시 되돌리는 것
		// 명시적 형변환
		Student p3 = (Student) ps1;
		System.out.println(p3.stdId);

	}

}
