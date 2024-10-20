package 버블정렬;

import java.util.Arrays;

public class 버블정렬_오름차순 {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 5, 1, 3 };

		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		for (int j = 1; j <= 4; j++) { // 4번 교환 해야하므로 
			int cnt = 0; // 현재 회차에서 교환된 횟수
			
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					cnt++;
				}
			}
			
			if(cnt==0) {
				System.out.println("이미 정렬 완료");
				break;
			}
			
			System.out.println(j + "회차 : " + Arrays.toString(arr));
		} 
	
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) { // 왼쪽이(i번째)크면 바꿔야함, 조건 필요
//				int temp; // 임시공간
//				temp = arr[i]; // i번째 수를 임시공간으로 옮김
//				arr[i] = arr[i + 1]; // i+1번째 수를 i로 옮김
//				arr[i + 1] = temp; // 임시공간의 수를 i+1번째로 옮김
//
//			}
//
//		}
//		System.out.println("1회차 : " + Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 2; i++) {
//			if (arr[i] > arr[i + 1]) { // 교환
//				int temp; // 임시공간
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//
//			}
//
//		}
//
//		System.out.println("2회차 : " + Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 3; i++) {
//			if (arr[i] > arr[i + 1]) { // 교환
//				int temp; // 임시공간
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//
//			}
//
//		}
//
//		System.out.println("3회차 : " + Arrays.toString(arr));

		
		
		
	}

}
