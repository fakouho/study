package 반복문;

public class Ex14이중for문 {

	public static void main(String[] args) {
		
		for(int j =1; j<=3; j++) {
			System.out.println("j : " + j + " ");
			for(int i = 1; i<=3; i++) {
				System.out.println("i : " + i + " ");
			}System.out.println("================");
		}
		
		for(int k =1; k<=2; k++) {  // 1 ; 2 ; 3 
			//System.out.println("k : " + k + " ");
			for(int h = 1; h<=k; h++) { // 4; 5; 6;
				//System.out.println("h : " + h + " ");
				System.out.println(); //7
			} // 1 2 / 4 5 / 7 / 6 5 / 3 2 / 4 5 / 7 6 5 / 7 6 5 3 2 종료// 조건 확인 후 반복 해도 되냐	
		
		}

	}

}
