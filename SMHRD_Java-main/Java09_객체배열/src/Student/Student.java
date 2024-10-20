package Student;

public class Student {

	// 속성(필드) 정의

	private String name;
	private int ban;
	private int num;

	// 기능(메서드) : getter(값 가지고오는거), setter(값 수정)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// this : 현재 생성된 인스턴스
		// this.변수 : 인스턴스의 필드값
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// override : 부모의 기능 재정의
	@Override
	public String toString() {
		return "이름: " + name + ", 반: " + ban + ", 번호: " + num;
	}

}
