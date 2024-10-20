package Product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("물건 개수 입력: ");
		int count = sc.nextInt(); // 배열의 길이

		Product[] goods = new Product[count];

		for (int i = 0; i < goods.length; i++) {

			System.out.print((i + 1) + ") 물건 이름: ");
			String name = sc.next();

			System.out.print((i + 1) + ") 단가: ");
			int unitPrice = sc.nextInt();

			System.out.print((i + 1) + ") 수량: ");
			int amount = sc.nextInt();

			goods[i] = new Product(name, unitPrice, amount);

			System.out.println();
		}

		System.out.println("제품명\t단가\t수량");
		int total = 0; // 총 금액
		
		for(int i = 0; i<goods.length; i++) {
			System.out.printf("%s\t%d\t%d\n", goods[i].getName(), goods[i].getUnitPrice(), goods[i].getAmount());
			total += goods[i].getUnitPrice()*goods[i].getAmount();
			
		}
		System.out.print("총 금액: " + total + "원");
	}

}
