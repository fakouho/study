package 연산자;

public class 대입연산자_예제 {

	public static void main(String[] args) {
		
		int num = 29;
//		num -= 2;
		num -= 2+3*4;
		
		System.out.println(num);
		
		int i = 3;
				
		System.out.println(++i); // 1증가 후 출력
		System.out.println(i++); // 출력 후 1 증가
		System.out.println(i);
		
		int a = 3;
		int b = 10;
		System.out.println(a==b ? "같다" : "다르다");
	
		
	}

}
