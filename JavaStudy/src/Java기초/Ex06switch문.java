package Java기초;

import java.util.Scanner;

public class Ex06switch문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("점수를 입력해 주세요");
        a= sc.nextInt();

        switch (a/10){
            case 10,9:
                System.out.println("a");
                break;
            case 8:
                System.out.printf("b");
                break;
            default:
                System.out.println("c");
                break;
        }
    }
}
