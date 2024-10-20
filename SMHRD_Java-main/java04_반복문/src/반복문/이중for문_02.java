package 반복문;

public class 이중for문_02 {

	public static void main(String[] args) {
		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=5; j++) {
//				System.out.print('*');
//			}System.out.println();
//		}
		
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j<i+1; j++) {
//				System.out.print('*');
//			}System.out.println();
//		}
		
//		for(int i = 0; i<5; i++) {
//			for(int j=i; j<5; j++) {
//				System.out.print('*');
//			}System.out.println();
//		}
		
		for(int i = 0; i<5; i++) {
			for(int j=i; j<4; j++) {
				System.out.print(" ");
			}
			for(int j =0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
