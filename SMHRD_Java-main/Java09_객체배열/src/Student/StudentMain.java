package Student;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 객체 배열 레퍼런스 변수 선언, 참조값을 저장
		Student[] std_arr;

		// 2. 2개의 Student 객체의 참조값을 저장할 수 있는 레퍼런스 배열 생성
		std_arr = new Student[2];

		// 3. 각 인덱스에 객체 참조값 저장
		// 3-1. 생성된 Student 객체의 참조값을 바로 0번 인덱스에 할당
		std_arr[0] = new Student();

		// 3-2. 객체 생성 후 변수에 저장된 참조값을 1번 인덱스에 할당
		Student std2 = new Student();
		std_arr[1] = std2;

		// => 현재 공간만 가지고 있음

		// 4. 생성된 각 객체의 값 초기화
		// std_arr[0] : std_arr 변수가 가지고 있는 참조값 가지고
		// 레퍼런스 배열을 찾아가서 그중에서 0번 인덱스에 저장되어 있는 Student
		// 객체 참조값을 가지고 해당 객체를 찾아감
		std_arr[0].setName("김미희");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);

		std_arr[1].setName("박병관");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);

		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan() + "반");
		System.out.println(std_arr[0].getNum() + "번");

		for (int i = 0; i < std_arr.length; i++) {
			System.out.println(std_arr[i].toString());
		}

	}

}
