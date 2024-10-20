package 이차원배열;

public class Ex01 {

	public static void main(String[] args) {

		// 2차원 배열 생성
		int[][] a = new int[5][5];

		int num = 1; // 배열에 들어갈 숫자 

		// 배열에 입력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//			System.out.printf("(%d, %d) ", i , j);
				a[i][j] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
