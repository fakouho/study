package Java기초.반복문;

import java.util.Scanner;

public class Ex04dowhile문 {
    public static void main(String[] args) {
        //1. 몸무게주차및 주차감량몸무게 출력 및 달성시 문장출력
        Scanner sc = new Scanner(System.in);
        System.out.printf("현재몸무게>>");
        int a = sc.nextInt();
        System.out.printf("목표몸무게>>");
        int b = sc.nextInt();
        int c = 1;
        while (true) {
            System.out.println(c+"주차 감량 몸무게 :");
            c++;
            int kg = sc.nextInt();
            a = a-kg;
            if(a<=b){
                System.out.println("목표몸무게 달성");
                break;
            }
        }
    }
}
