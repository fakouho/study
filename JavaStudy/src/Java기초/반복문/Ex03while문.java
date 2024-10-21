package Java기초.반복문;

import java.util.Scanner;

public class Ex03while문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("입력값을 입력하세요");
            int a = sc.nextInt();

            if (a < 10) {
                System.out.println(a);
                a++;
            } else {
                System.out.println("종료되었습니다.");
                break;
            }
        }

    }
}
