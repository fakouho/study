package 연산자;

public class Ex01산술연산자_예제05 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		int sum = num1+num2;
		int minus = num1-num2;
		int mul = num1*num2;
		double div = (double)num1/num2;
		// 정수-정수 연산->정수
		// 피연산자가 하나라도 실수 ->실수
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(mul);
		System.out.println(div);
		System.out.printf("%.2f", div); //소수점 둘째자리까지 출력 가능 

	}

}
