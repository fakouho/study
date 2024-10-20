package Á¶°Ç¹®;

import java.util.Scanner;

public class Ex07_change01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("³ÖÀ» ±İ¾× : ");
		int money = sc.nextInt();
		System.out.println("--¸Ş´º--");
		System.out.print("1.Äİ¶ó(1800¿ø) 2.ÆÄ¿ö¿¡ÀÌµå(2000¿ø) 3.Åº»ê¼ö(1200¿ø) >> ");
		int menu = sc.nextInt();
		
		int change1 = money - 1800;
		int change2 = money - 2000;
		int change3 = money - 1200;
		
		if(menu==1) {
			System.out.print("ÀÜµ· : " + change1 + "¿ø");
		}else if (menu==2) {
			System.out.print("ÀÜµ· : " + change2 + "¿ø");
		}else if (menu==3) {
			System.out.print("ÀÜµ· : " + change3 + "¿ø");
		}
		}
	
	}

