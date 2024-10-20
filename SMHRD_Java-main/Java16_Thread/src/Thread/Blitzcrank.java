package Thread;

//동시에 여러 스킬을 사용할 수 없음 // 싱글스레드 -> 기본클래스
public class Blitzcrank {
	private String skill; // 현재 사용중인 스킬 저장 필드
	
	public Blitzcrank(String key) { //특정한 스킬을 사용할 블츠객체 생성
		skill = key;	
	}

	//스킬 사용 메소드
	public void run() {
		System.out.println("입력 키 : " + skill);
		for(int i=1; i<=3; i++) {
			System.out.println(skill + "스킬 사용 중 : " + i + "s");
		}
		System.out.println(skill + "스킬 사용 종료 ");
	}
}
