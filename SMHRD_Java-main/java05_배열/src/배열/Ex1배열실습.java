package 배열;

public class Ex1배열실습 {
	
	public static void main(String[] args) {
	
	// 배열을 만들어 보자
	// String
	// 크기5
	// 배열을 선언	
	String[] snack;
	// 배열 생성
	snack = new String[5];
	
	snack[0] = "홈런볼";
	snack[1] = "홈런볼";
	snack[2] = "홈런볼";
	snack[3] = "홈런볼";
	snack[4] = "홈런볼";
	
	// 왜 크기가 5인가요?
	// snack 배열의 크기와 snack2 배열의 크기는 같다
	
	String[] snack2= {"홈런볼","다이제","민트초코파이","꾀돌이","아폴로"};
	
	System.out.println(snack2[1]); // 다이제를 불러오고 싶을때 
	
	
}
	
}
