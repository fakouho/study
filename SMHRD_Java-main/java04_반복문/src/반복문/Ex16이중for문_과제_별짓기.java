package 반복문;

public class Ex16이중for문_과제_별짓기 {

	public static void main(String[] args) {

		// 1. 윗 삼각형
		for (int i = 1; i <= 5; i++) { // 줄 수 1~5까지 변화에 따라
			for (int j = 4; j >= i; j--) { // 공백의 변화
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // *의 변화
				System.out.print("**");
			}
			System.out.println("");
		}

		// 2. 아래 삼각형
		for (int i = 1; i <= 5; i++) { // 5번 반복
			for (int j = 0; j < i-1; j++) { 
				System.out.print(" ");
			} for (int k = 5; k >= i; k--) {
				System.out.print("**");
			} System.out.println("");

		}
	}
}

		