package Java기초;

import java.util.Scanner;

public class Ex04삼항연산자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("a의 입력 값 = ");
        a=sc.nextInt();
        System.out.println("b의 입력 값 =");
        b= sc.nextInt();
        String Dab = a>b ? "a가 더크다" : "b가 더크다";
        System.out.printf(Dab);
    }

}
