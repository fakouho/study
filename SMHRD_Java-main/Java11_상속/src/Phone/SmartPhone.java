package Phone;

// 상속 : class 클래스 이름 extends 상위 클래스 이름
// -> 상위클래스를 상속받아서 새로운 클래스 작성
// -> 상위클래스의 필드/메서드를 현재 클래스에 따로 정의하지 않아도 사용할 수 있음
public class SmartPhone extends Phone {
	// field(속성) : (스피커, 마이크) -> Phone, 카메라
	// method(기능) : (전화하다, 문자하다) -> Phone, 인터넷하다

	String camera;
	
	// SmartPhone이 생성이 될 때 speaker 필드 값을 초기화(LG)
	public SmartPhone() {
		super("LG"); // 슈퍼클래스의 생성자 호출
		//정의안하면 슈퍼클래스의 기본생성자 호출
		//super.mic
		
		//super.message(); // 부모 인스턴스에 접근
		//this.message(); // 현재 생성된 인스턴스에 접근 / this에 더 큰 개념 
	}

	public void internet() {
		System.out.println("인터넷 접속!");
	}

	public String getSpeaker() {
		//super: 부모 맴버(필드,메서드) 호출 
		return super.getSpeaker() ;
	}
}
