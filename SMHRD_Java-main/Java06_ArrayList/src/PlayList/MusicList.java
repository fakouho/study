package PlayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {
		// 첫 화면
		// 입력 도구 불러오기
		Scanner sc = new Scanner(System.in);

		// 뮤직 리스트가 담길 ArrayList 선언 해보자 -> musicList
		ArrayList<String> musiclist = new ArrayList<String>();
		// [1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >>

		while (true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			// 1, 2, 3, 4 다른 숫자인지 판단 -> 조건문
			// 4 -> "프로그램이 종료되었습니다" 출력 + 프로그램 종료
			// 다른숫자 -> "잘못 입력 하셨습니다." 출력

			// 숫자선택
			int select = sc.nextInt();

			if (select == 1) {
				// 노래 조회
				// get 사용해서 지금까지 저장되어 있는 데이터를 불러와야함
				// 조건 1. 단 리스트에 데이터가 없다면 "현재 재생목록이 없습니다."
				// 데이터가 없다. size() == 0
				if (musiclist.size() == 0) {
					System.out.println("재생목록이 없습니다");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						// i+1로 리스트 순번출력하기
						System.out.println((i + 1) + "." + musiclist.get(i));
					}
				}
			} else if (select == 2) {
				// 노래 추가 기능
				// 재생목록 먼저 보여주고
//				System.out.println("=====현재재생목록=====");
//				musiclist.add("Maria");
//				musiclist.add("HowYouLikeThat");
//				musiclist.add("깡");
				if (musiclist.size() == 0) {
					System.out.println("재생목록이 없습니다");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						System.out.println((i + 1) + "." + musiclist.get(i));
					}
				}
//				System.out.println("================");

				// [1] 마지막 부분에 노래 추가 [2] 원하는 위치에 노래 추가
				// 1, 2 ->조건문
				// 1-> add(데이터값)
				// 2-> add(인덱스값, 데이터값)

				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가>> ");
				int num = sc.nextInt();
				System.out.print("추가할 노래 입력 >> ");
				String music = sc.next();

				if (num == 1) {
					musiclist.add(music);
				} else if (num == 2) {
					System.out.print("추가할 위치 입력 >> ");
					int ch = sc.nextInt();
					musiclist.add(ch - 1, music);
					// 사용자가 원하는 위치와 인덱스 값을 일치 ch-1
					System.out.println("추가가 완료 되었습니다.");
				}

			} else if (select == 3) {

				System.out.println("=====현재재생목록=====");

				if (musiclist.size() == 0) {
					System.out.println("재생목록이 없습니다");
					System.out.println("================");
				} else {
					for (int i = 0; i < musiclist.size(); i++) {
						System.out.println((i + 1) + "." + musiclist.get(i));
					}

				}
				System.out.println("================");

				System.out.print("[1]선택삭제 [2]전체삭제 >> ");

				int ch1 = sc.nextInt();

				if (ch1 == 1) {
					System.out.print("삭제할 노래 선택>> ");
					int ch2 = sc.nextInt();
					musiclist.remove(ch2 - 1);
					System.out.println("노래가 삭제 되었습니다");
				} else if (ch1 == 2) {
					musiclist.clear();
					System.out.println("전체 리스트가 삭제 되었습니다.");
				}

			} else if (select == 4) {
				// 프로그램이 종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}

		}

	}

}
