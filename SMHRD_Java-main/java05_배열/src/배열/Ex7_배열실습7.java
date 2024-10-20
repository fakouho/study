package 배열;

import java.util.Random;

public class Ex7_배열실습7 {

	public static void main(String[] args) {

		// 랜덤 숫자를 불러오는 도구
		Random rd = new Random();

		System.out.println("====로또타임=====");
		System.out.println("이번주에 출력번호는요...! 두구두구");

		// 5칸짜리 정수형 배열을 만들기
		int[] num = new int[5];

		// 임의값으로 초기화(1~10까지)
		for (int i = 0; i<num.length; i++) {
			// 0부터 10까지 랜덤
			// 1부터 10까지 랜덤 ->nextInt(9)+1
			num[i] = rd.nextInt(9)+1;

			// 입력한 i값을 검사 // 중복된값 제거...
			for (int j = 0; j < num.length; i++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}

		// 배열 출력하기
		for(int i = 0 ; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

	

}


