package MusicPlayer;

public class Music {

	// model

	// mp3 데이터
	// 노래제목 -> title
	// 가수이름 -> singer
	// 재생시간 -> playTime
	// getter -> 데이터를 가져만 올것
	// 생성자 메서드
	// 접근제한자 -> private

	private String title;
	private String singer;
	private int playTime;

	// 경로에 대한 데이터 넣기
	private String path;

	public Music(String title, String singer, int playTime, String path) {
		// super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}
}
