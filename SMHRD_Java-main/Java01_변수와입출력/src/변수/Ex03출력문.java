package 변수;

public class Ex03출력문 {

	public static void main(String[] args) {
		
		//출력: 디스플레이(콘솔)에 문자나 숫자 등을 나타내는 것
		System.out.print("출력문1");
		
		System.out.print("출력문1\n");
		//\n: 개행문자
		
		//println: 출력 후 개행
		System.out.println("출력문2");
		System.out.println("출력문3");
		
		// 1(정수형). 오늘 점심값: 20000(숫자)원		
		System.out.println(1+". 오늘 점심값: "+20000+"원");
		
		int num = 1;
		int money = 20000;
		String won = "원";
		System.out.println(num+". 오늘 점심값: "+money+"원");
		//%d: 정수형자리, %s:문자형자리
		System.out.printf("%d. 오늘 점심값: %d%s\n", num, money, won);
		System.out.println("끝!");


	}

}
