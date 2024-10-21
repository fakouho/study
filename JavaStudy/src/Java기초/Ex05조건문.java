package Java기초;

import java.util.Scanner;

public class Ex05조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("입력받은 값 = ");
        a = sc.nextInt();
        if(a>50){
            System.out.println(a+"는 50보다 큰 값입니다.");
        }else {
            System.out.println("50보다 작아요");
        }
    }
}
