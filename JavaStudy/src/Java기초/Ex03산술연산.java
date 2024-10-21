package Java기초;

import java.util.Scanner;

public class Ex03산술연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.printf("입력받은 값 >");
//        String name = sc.next();
//        System.out.printf("입력내용 > "+ name);

        int a;
        int b;
        System.out.printf("a입력 값");
        a = sc.nextInt();
        System.out.printf("b입력 값");
        b = sc.nextInt();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("증감"+(++a));
        System.out.printf("감소"+(--b));



    }
}
