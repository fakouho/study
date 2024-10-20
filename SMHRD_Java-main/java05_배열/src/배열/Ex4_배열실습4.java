package 배열;

public class Ex4_배열실습4 {

	public static void main(String[] args) {
		// 배열 지정
		// 크기 9를 가진 정수데이터만 담을 수 있는 배열 생성
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		int sum = 0; //초기화 

		//2. 총합(배열안에 들어가 있는 데이터 값들의 합)
		for(int i = 0; i < arr.length ; i++)
		{ // 배열 데이터값의 총합 구하기
			sum = sum + arr[i];
		} 
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/arr.length);

	}

}
