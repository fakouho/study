package Java기초;

import java.util.Scanner;

public class Ex02변수선언 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>");
        int num = sc.nextInt();
        System.out.printf("입력받은 숫자값>"+num);
    }
}
