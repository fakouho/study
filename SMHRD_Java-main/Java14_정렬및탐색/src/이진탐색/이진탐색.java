package 이진탐색;

public class 이진탐색 {

	public static void main(String[] args) {
		int[] arr = {1, 7, 16, 25, 30, 33, 41, 66, 78, 90};
		
		int num = 78; // 우리가 찾고 싶은 숫자
		
		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		while(true) {
			int centerIndex = (lowIndex+highIndex)/2;
			
			if(arr[centerIndex]==num) {
				System.out.println(num+"은 "+centerIndex+"번째 숫자입니다");
				break;
			} else if(arr[centerIndex]<num) {
				lowIndex = centerIndex+1;
			} else {
				highIndex = centerIndex-1;
			}
		}

	}

}
