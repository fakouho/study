package EPoketmon;

public interface EPoketmon {

	// 인터페이스 내에는 상수만 선언 가능(final)
	// 상수는 무조건 선언 할 때 초기화 시켜줘야함
	final String type = "전기";
	int level = 1; // 상수
	// 인터페이스 내에는 변수선언이 불가능하기 때문에 final 키워드 안붙여도
	// 상수로 선언 (초기화는 시켜줘야함)

	// 인터페이스 내에서는 추상메소드만 선언가능
	public abstract void attack();

	public void moving();
	// abstract 키워드를 붙이지 않아도 추상메소드로 선언됨

	// Java8버전 이상부터는 일반메소드로 선언가능
	// (default, static)
	// default : 접근제한자가 아니라 인터페이스내에서 일반메소드를 선언할 수 있게 해주는 키워드
	public default void hello() {
		System.out.println("안녕");
	}

	public static void hello1() {
		System.out.println("안녕1");
	}

}
