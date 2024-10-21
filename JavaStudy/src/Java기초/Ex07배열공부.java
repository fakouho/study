package Java기초;

import java.util.Scanner;

public class Ex07배열공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        int max;
        int min;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf((i) + "값을 입력해주세요>> ");
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("합계: " + sum);
    }
}
