package Thread;
// 동시에 여러개의 스킬을 사용할 수 있음 -> 멀티태스킹 -> 멀티프로세싱 / 멀티스레드(자바)

// 멀티스레드 작성 방법 1.Thread 클래스를 상속 

public class Ari extends Thread {
	private String skill;

	public Ari(String key) {
		skill = key;
	}

	//Thread 클래스의 run() 메서드 오버라이딩(재정의)
	//run() -> 스레드(다중작업) 코드
	//스레드는 run() 메서드에서부터 실행을 시작하고 run() 종료되면 스레드도 종료
	//이떼 run()은 아무일도 하지 않음 
	public void run() {
		System.out.println("입력 키 : " + skill);

		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "스킬 사용 중 :" + i + "s");
		}
		System.out.println(skill + "스킬 사용 종료  ");
	}

}
