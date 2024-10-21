package Java기초;

import java.util.Scanner;

public class Ex06switch문예제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 돈 입력
        // 2. 메뉴 선택
        // 3. 잔돈 출력
        int money;
        int sum = 0;  // sum 변수를 초기화해야 합니다.
        int menu;

        System.out.println("금액을 입력하세요");
        money = sc.nextInt();

        System.out.println("메뉴를 입력하세요");
        System.out.printf("1.500  2.300  3.400\n");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                sum = 500;
                break;
            case 2:
                sum = 300;
                break;
            case 3:
                sum = 400;
                break;
            default:
                System.out.println("입력선택 불가");
                return;
        }

        // 잔돈 출력
        if (money >= sum) {
            System.out.printf("잔돈: %d\n", money - sum);
        } else {
            System.out.println("금액이 부족합니다.");
        }

    }
}
