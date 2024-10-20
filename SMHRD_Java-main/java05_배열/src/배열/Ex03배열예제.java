package 배열;

import java.util.Random;

public class Ex03배열예제 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[10];
	
		int cnt = 0;
		

		System.out.print("array에 들어있는 홀수는 " );
		
		
	      for(int j =0; j<10; j++) {
	          arr[j] = rd.nextInt(100);
	          }
			
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 1) {
//				System.out.print(arr[i]);
//				cnt++;
//			}
//		}
	      
		System.out.println("이며 " );	
		System.out.println("총 홀수 개수는 " + cnt + "입니다.");
		
		}
		
	}