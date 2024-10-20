package 이차원배열;

public class Ex04_비정방형배열 {

	public static void main(String[] args) {
		
		// 배열의 개수 -> 4개		
		
		// 비정방형 배열 생성 및 레퍼변수 선언 방법
		// 각 배열의 길이가 다르기 때문에 생성시 길이 지정할 수 없음
		int[][] arr = new int[4][];
		
		//이차원(비정방형)도 값을 알고 있는 경우에는 
		//배열 생성 후에 바로 레퍼런스 변수 선언
		int[][] a = {{1}, {1,2}, {1,2,3}};
		
		for(int i=0; i<a.length; i++) { //1차원 배열의 개수 반복 
			for(int j=0; j<a[i].length; j++) {//각 배열의 길이만큼 반복
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		arr[0] = new int[3];
		arr[1] = new int[5]; 		
		arr[2] = new int[4];
		arr[3] = new int[6];
		
		arr[0][0] = 70;
		arr[0][1] = 65;
		arr[0][2] = 80;
		

		
	}

}
