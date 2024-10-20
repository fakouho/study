package 반복문;

import java.util.Scanner;

public class Ex03while문_예제03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int odd = 0; // 홀수개수 카운팅
		int even = 0; // 짝수개수 카운팅
		
		while(true) {
			
		System.out.print("숫자입력: ");
		num = sc.nextInt();		
		
		if(num==-1) {
			break; // break: 만나는 즉시 가장 가까운 반복문 나감
		}
		
		if(num%2==1){
			odd++; // 홀수
		}else 
			even++; // 짝수
		}
		
		System.out.println("홀수개수: " + odd);
		System.out.println("짝수개수: " + even);
		
	}

	}

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//while(num!=-1){
// System.out.print("숫자 입력 : ");
// num = sc.nextInt();   
// 
// if(num%2==0)
//    count++; 
// else if(num%2==1) {
//    cnt++;
// }         
//} 
//System.out.println("짝수 개수 : " + count);
//System.out.println("홀수 개수 : " + cnt);

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//while(true){
// System.out.print("숫자 입력 : ");
// num = sc.nextInt();   
// 
// if (num % 2 == 0)
//    count++;
// else if (num % 2 == 1) {
//    cnt++;
// }   
//          
// if(num==-1) {
//    System.out.println("짝수 개수 : " + count);
//    System.out.println("홀수 개수 : " + cnt);
//    break;
// }
// 
//}

//int num = 0;
//int count = 0;
//int cnt = 0;
//
//do {
// System.out.print("숫자 입력 : ");
// num = sc.nextInt();   
// 
// if (num % 2 == 0) {
//    count++;
// } else if (num % 2 == 1) {
//    cnt++;
// }   
//                   
//}while(num!=-1);
//
//System.out.println("짝수 개수 : " + count);
//System.out.println("홀수 개수 : " + cnt);




