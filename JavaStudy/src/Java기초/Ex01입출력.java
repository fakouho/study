package Java기초;


import java.util.Scanner;

public class Ex01입출력 {
    public static void main(String[] args) {
        System.out.printf("Hello Word");

        Scanner sc = new Scanner(System.in);
        System.out.println("글자를 입력하세요>>");
        String input = sc.nextLine();

        System.out.println("입력내용"+input);
    }
}
