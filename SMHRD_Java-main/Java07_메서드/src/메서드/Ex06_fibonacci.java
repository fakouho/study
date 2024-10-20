package 메서드;

public class Ex06_fibonacci {

	public static void main(String[] args) {

		// 자연상에 존재하는 피보나치 수열
		// 수열? 1 2 3 4 5
		// 2 4 6 8 10 차이가 동등하게 증가하는 수열 -> 등치수열
		// 2 4 8 16 32 -> 등비수열
		// 숫자들이 규칙적으로 나열
		// 피보나치
		// fibonacci 수열
		// 1 1 2 3 5 8 13 21 34 55


		int num4 = 5;
		int result4 = fibonacci(num4);
		System.out.println("피보나치 수열의 " + num4 + "번째 항은 " + result4 + "입니다.");

	}

	public static int fibonacci(int num4) {		
		int result4 = 0;
		// 재귀함수
		// 자기 자신을 호출하는 함수

		// hint. 1번째와 2번째 항이 1로 고정
		if (num4 == 1) {
			return 1;
		} else if (num4 == 2) {
			return 1;
		} else {
			return fibonacci(num4 - 2) + fibonacci(num4 - 1);
		} 
		// else if 사용하게 된다면 else에 대한 return이 꼭 있어야함

		// num째 항을 구하고 싶다면
		// num-2번째와 num-1번째

//		for(int i = 1; i<=num4; i++) {
//			if(i==1||i==2) {
//				result4 = 1;
//			}else if(i==(i-2)+(i-1)) {				
//			} result4 += i;
//		}
//		System.out.println(result4);
		
		

	}
}
				
		
		
		
		
//		if (num4 == 1) {
//			result4 = 1;
//		} else if(num4==2) {
//			result4 = 1;
//		}
//		1항은 1
//		2항은 1
//		3항은 2 (1항+2항)
//		4항은 3 (2항+3항)

//		if (num4 == 1) {
//			result4 = 1;
//		} else {		
//			for(int i = 1; i<=num4; i++)
//			{
				
				
				
			
		

		
		

		
		

