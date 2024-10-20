package Thread;

public class Ari2 extends Thread {
	private String skill;

	public Ari2(String key) {
		skill = key;
	}

	public void run() {
		System.out.println("입력 키 : " + skill);

		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "스킬 사용 중 :" + i + "s");
		}
		System.out.println(skill + "스킬 사용 종료  ");
	}

}
