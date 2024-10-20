package 메서드;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		// is메서드 -> 반환하는 타입이 boolean

		boolean result = isDivisor(num1, num2);
//		System.out.println(result);

		// 출력하는 기능이 들어가있는 메서드를 만들자 -> void
		getDivisor(24);

		// getSumofDivisor()메서드
		int num = 10;
		int result2 = getSumofDivisor(num);
		// 리턴타입 -> int
		System.out.println("약수의 합 : " + result2);

		// isPerfectNumber
		// 완전수
		// 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수
		// 6-> 1 2 3 == 6
		// 9 -> 1 + 3 != X

		int num3 = 496;
		boolean result3 = isPerfectNumber(num3);
		System.out.println("완전수? >> " + result3);
		
		// 자바는 변수명 규칙 -> camal
		int startNumber = 2;
		int endNumber = 1000;
		// 2~1000사이의 완전수를 구하자
		getperfectNumber(startNumber, endNumber);
		
	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		// 만약, 다음의 조건을 만족한다면
		// num1을 num2로 나눴을 때 나누어 떨어지니? or
		// num2가 num1의 약수니? or
		// num1이 num2의 배수니
		// result에 true값

		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void getDivisor(int num) {

		String result = "";
		result += num + "의 약수 : ";
		// 이 result에 24의 약수를 달아주세요
		// 24의 약수를 찾아주세요

//		System.out.println("24의 약수 :");

		for (int i = 1; i <= num; i++) {
			// i가 약수인지 아닌지
			// num%i == 0 -> isDivisor 구현하는 기능과 같다
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		System.out.println(result);

//		for (int i = 1; i <= 24; i++) {
//			if (num % (i) == 0) {
//				System.out.print(i + " ");

//			}
//		}

//		System.out.print(result);

	}

	public static int getSumofDivisor(int num) {
		int result2 = 0;

		// 만약 num에 10이 들어왔다면
		// 약수는 얼마 인가요? 1,2,5,10
		// 약수의 합은?

		// 만약, 1이 10의 약수라면
		// result2에 더하자

		// int타입
		// 4byte
		// 1byte = 8bit
		// 1bit 2^1
		// 1byte 2^8 => 256

		// 10 -> 1 2 5 10
		// 36 -> 1 2 3 4 9 12 18 36

		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result2 += i;
			}
		} // System.out.println(result2);

//		if (num % 1 == 0) {
//			result2 += 1;
//		}

		return result2;
	}

	public static boolean isPerfectNumber(int num) {

//		boolean result3 = false;
		// 만약, num이 완전수라면 true를 리턴
		// 완전수란?
		// 자기자신을 제외한 약수의 합이 자기 자기자신과 같은것
		// 완전수 여부를 판단하는 메서드를 만들어 주세요
		// hint1. 6과 28은 완전수
		// hint2. 자기 자신을 포함한 약수의 합을 getSumofDivisor
		// hint3. getSumofDivisor(6) 12,
		// getSumofDivisor(28) 56
		// 완전수를 구하기 위해서는 합의 /2값을 구해야함

		for (int i = 1; i < num; i++) {
			if (getSumofDivisor(num) / 2 == num) {
				return true;
			}
		}

		return false;

	}
	
	public static void getperfectNumber(int startNumber, int endNumber) {
		
		String result = "";
		result += startNumber+"~"+endNumber+"까지의 완전수 : ";
		
		// 만약, 2가 완전수라면
		// result에 2를 추가
		
		// 만약, 3일 완전수라면
		// result에 3을 추가
		
		// ...
		
		// 만약, 1000이 완전수라면
		// result 1000을 추가!
		
		for (int i = startNumber; i <= endNumber; i++) {
			if (getSumofDivisor(i) / 2 == i) {
				result += i + " ";
			}
		}
		System.out.println(result);
				
		
	}
}


