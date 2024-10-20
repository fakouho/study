package 반복문;

public class Ex17_예제01 {

	public static void main(String[] args) {
	
		/*
		 * int sum = 0; int result = 0;
		 * 
		 * for(int i = 77; i>=1; i--){ sum = i * ((i/77)+i); result +=sum; }
		 * System.out.println(result);
		 */
		
		
		
		// 77~1 1씩 다운
		int down = 77;
		// 1~77 1씩 증가
		int up = 1;

		int sum1 = 0; // 누적합을 저장할 변수 -> 출력

		for (int i = 1; i <= 77; i++) { // for (int i = 1; i <= 77; i++,down--,up++) {
			sum1 = sum1 + down * up;    // 			sum1 = sum1 + down * up;
			down--;						// 	} System.out.println(sum1);
			up++;
		} System.out.println(sum1);

//		sum = sum + down * up;
//		down--;
//		up++;
//		
//		sum = sum + down * up;
//		down--;
//		up++;
//
//		sum = sum + down * up;
//		down--;
//		up++;
		
		int sum2 = 0; // 누적합
		
		for(int i=1; i<=77; i++){
			//78-1 i
			sum2 +=(78-i)*i;
		}System.out.println(sum2);
	}

}


