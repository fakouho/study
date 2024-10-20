package 반복문;

public class Ex15이중for문_예제01 {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) { // 2~9
			System.out.print(i + "단 : ");
			
			for(int j=1; j<10; j++) { // 1~9
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
			

	}

}
