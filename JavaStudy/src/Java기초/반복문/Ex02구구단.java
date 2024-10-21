package Java기초.반복문;

import java.util.Scanner;

public class Ex02구구단 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 값을 적어주세요");
        a = sc.nextInt();
        for (int i = 1; i <10 ; i++) {
            System.out.println(a+"x"+i+" = "+(a*i));
        }
    }
}
