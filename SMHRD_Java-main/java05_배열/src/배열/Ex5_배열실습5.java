package 배열;

public class Ex5_배열실습5 {

	public static void main(String[] args) {
		// 배열을 생성해야한다.
		
		int arr[] = {23,45,95,17,6,89,47,56,68,81};
		
		// 배열값에 접근
		
		int min = arr[0];
		int max = arr[0];
		
		 for(int i = 0; i<arr.length; i++) {
			 
			if(min > arr[i]) {
				min = arr[i];
				
				} else if(max < arr[i]){
					max = arr[i];
				}
			} 
			System.out.println("최소값 : " + min );
			System.out.println("최대값 : " + max );
				
		}
		
		// 최소값(min) -> arr[0] > arr[1]
		// min = arr[1]
		
		// 최대값(max) -> arr[0] > arr[1]
		// max[0]

	}


