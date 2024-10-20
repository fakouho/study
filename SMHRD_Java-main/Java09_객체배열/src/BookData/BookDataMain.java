package BookData;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// 입력 도구
		Scanner sc = new Scanner(System.in);

		// book data 가 담길 ArrayList 선언 해보자 -> bd
		ArrayList<BookData> bd = new ArrayList<BookData>();

		int select = 0;

		while (true) {
			System.out.print("1)책 추가 2)책 삭제 3)내가 살 수 있는 책 4)종료 >> ");

			select = sc.nextInt();

			if (select == 1) {

				System.out.print("책 이름: ");
				String title = sc.next();
				System.out.print("가격: ");
				int price = sc.nextInt();
				System.out.print("작가: ");
				String writer = sc.next();

				bd.add(new BookData(title, price, writer));

			} else if (select == 2) {
				for (int i = 0; i < bd.size(); i++) {
					System.out.printf("%d. %s\t%d\t%s\n", (i + 1), bd.get(i).getTitle(), bd.get(i).getPrice(),
							bd.get(i).getWriter());
				}
				System.out.print("삭제 하고 싶은 책>>");
				int del_select = sc.nextInt();

				bd.remove(del_select - 1);

			} else if (select == 3) {
				System.out.print("금액을 입력하시오: ");
				int money = sc.nextInt();

				for (int i = 0; i < bd.size(); i++) {
					if (money >= bd.get(i).getPrice()) {
						System.out.printf("%d. %s\\t%d\\t%s\\n", (i + 1), bd.get(i).getTitle(), bd.get(i).getPrice(),
								bd.get(i).getWriter());
					}
				}

			} else if (select == 4) {
				// 프로그램이 종료
				System.out.println("종료");
				break;

			}

		}

	}

}

