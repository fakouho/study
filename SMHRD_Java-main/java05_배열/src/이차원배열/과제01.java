package 이차원배열;

public class 과제01 {

	public static void main(String[] args) {

	    // 5*5 배열을 먼저 선언
	      int[][] num = new int[5][5];

	      // 데이터 입력부
	      int cnt = 1;

	      // 두번째 수 마지막번째부터 1
	      for (int i = 0; i < num.length; i++) {
	         for (int j = 0; j < num[i].length; j++) {
	            num[i][4-j] = cnt;
	            cnt++;
	         }
	      }

	      for (int i = 0; i < num.length; i++) {
	         for (int j = 0; j < num[i].length; j++) {
	            System.out.print(num[i][j] + "\t");
	         }
	         System.out.println();
	      }
	   }
	}
