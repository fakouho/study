package Phone;

public class Phone {

	// field(속성) : 스피커, 마우스
	// method(기능) : 전화하다, 문자하다

	private String speaker = "삼성";
	private boolean mic;

	public void call() {
		System.out.println("따르릉");
	}

	// 생성자
	public Phone(String speaker) {
		this.speaker = speaker;
	}

	public Phone() {
		
	}

	public void message() {
		System.out.println("문자");
	}

	public String getSpeaker() {
		return speaker;
	}

}




