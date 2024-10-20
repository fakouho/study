package 메서드;

public class Ex03 {

	public static void main(String[] args) {
		
		// 매개변수: int[] 1개
		// 반환타입: void
		
		int[] arr = {1, 3, 7, 2, 8, 9};
		
		arrayToString(arr);
	}
	
	public static void arrayToString(int[] a) {
		for(int i:a){
			System.out.print(i + " ");
		}
		
		
		
	}

}
