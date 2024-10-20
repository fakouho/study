package 연산자;

public class Ex08비트시프트연산자 {

	public static void main(String[] args) {

		//비트연산자 : AND(&), OR(|), XOR(^), NOT(~)
		
		System.out.println(3&5);
		System.out.println(6&7);
		System.out.println(6|7);
		System.out.println(3^5);
		System.out.println(~3);
		
		
		//(비트)시프트연산자 : >> <<
		int a = 3;
		int b = a<<2;
		System.out.println(b);		


	}

}
