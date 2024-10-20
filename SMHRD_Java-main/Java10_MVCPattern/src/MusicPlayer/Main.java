package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class Main {
	
	//view

	public static void main(String[] args) {
		// 뮤직플레이어 만들기

		// 입력받는 도구 불러오기
		Scanner sc = new Scanner(System.in);

		// Scanner, Random -> 다른 클래스에서 기능 가져와서 사용
		// MP3Player 사용하기 위해 import
		MP3Player mp3 = new MP3Player();
		// Controller 안에 기능을 사용하기 위해 클래스 가져오기
		Controller con = new Controller();
		// Music 클래스안에 있는 변수들에게 데이터를 보내줘야함
//		System.out.println(music1.getTitle());
//		System.out.println(music1.getSinger());
//		System.out.println(music1.getPlayTime());		

		// 노래 5가지 정보 저장하기
		Music music1 = new Music("깡", "Rain", 59, "C:\\Users\\smhrd\\Desktop\\music\\깡.mp3");
		Music music2 = new Music("Maria", "화사", 59, "C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("MAGO", "여자친구", 59, "C:\\Users\\smhrd\\Desktop\\music\\MAGO.mp3");
		Music music4 = new Music("How you like that", "블랙핑크", 59,
				"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("살짝설렜어", "오마이걸", 59, "C:\\Users\\smhrd\\Desktop\\music\\살짝설렜어.mp3");

		// 노래에 대한 정보를 정리하기 위해서 ArrayList
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// "깡" music.getTitle();
		// System.out.println(list.get(0).getTitle());

		int index = 0;

		while (true) {
			// [1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			// 사용자에게 입력받은 숫자 변수
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생
				// mp3.play(String path);
				// getPath
				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				// 노래를 재생시키는 기능
				// mp3.play(list.get(index).getPath());
				// Controller 기능을 불러옴
				con.play(list, index);

			} else if (menu == 2) {
				// 정지
				// 노래가 멈추는 기능
				// 노래가 재생중일때만 멈추는 기능 사용가능
//				if (mp3.isPlaying() == true) {
//					mp3.stop();
//				}
				con.stop();

			} else if (menu == 3) {
				// 이전곡
				// 1. 인덱스
				// 2. 이미 노래가 재생중이라면 노래를 멈춰
				// 3. 인덱스 값이 0보다 작으면 index 끝값(list.size()-1)돌아간다.

				index--;

				con.stop();

//				if (mp3.isPlaying()) {
//					mp3.stop();
//				}
				// 조건2. list 크기를 넘어서면 처음노래로 다시 돌아와서 재생
				if (index <= 0) {
					index = list.size() - 1;
				}

				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				con.play(list, index);
				// mp3.play(list.get(index).getPath());

			} else if (menu == 4) {
				// 다음곡
				// 인덱스 +1
				// 증가된 인덱스 값안에 들어있는 노래를 재생시키자
				// 노래 이미 재생중이라면 노래를 멈추고
				// 그 다음 노래 재생

				index++;

				con.stop();

//				if (mp3.isPlaying() == true) {
//					mp3.stop();
//				}
				// 조건2. list 크기를 넘어서면 처음노래로 다시 돌아와서 재생
				if (index > list.size() - 1) {
					index = 0;
				}

				System.out.print(list.get(index).getTitle() + "\t");
				System.out.print(list.get(index).getSinger() + "\t");
				System.out.println(list.get(index).getPlayTime());

				con.play(list, index);
				// mp3.play(list.get(index).getPath());

			} else if (menu == 5) {
				// 프로그램이 종료
				con.stop();
				System.out.println("종료");
				break;
			} else {
				System.out.print("잘못 입력 하셨습니다.");
			}

			// 1,2,3,4를 입력 받았을 때는 반복
			// 5를 입력 받았을 때는 멈춤
			// while;

		}

	}

}
