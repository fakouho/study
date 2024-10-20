package 배열;

public class Ex3배열실습3 {

	public static void main(String[] args) {
		
		// 배열 지정
		
		// 1. 크기 10을 가진 정수데이터만 담을 수 있는 배열 생성
		// int[] arr = new int[10];
		
		int arr[] = {45, 37, 95, 103, 5, 12, 17, 28, 56, 59};
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]%3==0) {			
				System.out.println(arr[i]);
			}
		}
	}

}
