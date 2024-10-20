package 반복문;

import java.util.Scanner;

public class Ex06while문_예제06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수1: ");
//		int num1 = sc.nextInt() ; 
//		System.out.print("정수2: ");
//		int num2 = sc.nextInt();		
//		System.out.print("연산자(+/-) : ");		
//		String a = sc.next();
//		
//		int sum = num1 + num2;
//		int minus = num1 - num2;
//		String y_n = "";
//			
//		while(true)
//			
//		if(a.equals("+")) {
//			System.out.println(num1 + "+" + num2 + "=" + sum);
//		} else if(a.equals("-")) {
//			System.out.println(num1 + "-" + num2 + "=" + minus);			
//		} 
//		System.out.print("계속 하시겠습니까? ");		 
//		y_n = sc.next();
//		
//		if(y_n.equals("N")||y_n.equals("n")) {
//			break;
//		}
		
		int num1 = 0;
		int num2 = 0;
		String op = "";
		
		while(true) {
		
		System.out.print("정수1: ");
		num1 = sc.nextInt() ; 
		System.out.print("정수2: ");
		num2 = sc.nextInt();		
		System.out.print("연산자(+/-) : ");		
		op = sc.next();
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d", num1, op, num2, num1+num2);
		} else if(op.equals("-")) {
			System.out.printf("%d %s %d = %d", num1, op, num2, num1-num2);					
		} 
		
		System.out.print("\n계속하시겠습니까? (Y/N) ");
		String con = sc.next();
		
		if(con.equals("N")||con.equals("n")) {
			System.out.println("종료!");
		break;
		
		}
		}

	}
}
	


