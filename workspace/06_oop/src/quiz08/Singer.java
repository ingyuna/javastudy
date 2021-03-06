package quiz08;

public class Singer {

	// field
	private String name;
	private Song[] songs;
	private int idx;    // 인덱스는 필드니까 초기화를 안줘도 0이다.
	
	// constructor
	public Singer(String name, int songCount) {  // 이 가수가 가지게 될 노래의 갯수. 현재 노래의 배열이 없기 때문에 아직 모른다.
		this.name = name;
		this.songs = new Song[songCount];   // 가독성의 문제로 this를 붙여준다. 물론 this는 생략가능.
	}
	
	// method
	public void addSong(Song song) {
		if (idx < songs.length) {
		songs[idx++] = song;  // 인덱스 뒤에다 붙여준다. 앞에다 붙여주면 x. 인덱스는 0번이니까 사용 '후' 증가시켜줘야함.
		// addSong() 호출마다 idx가 증가하므로, idx는 추가된 노래의 개수입니다.
	} else {
		System.out.println("더 이상 노래를 추가할 수 없습니다.");
	}
}
	public void info() {
		// 가수명, 노래목록
		System.out.println("가수명: " + name);
		System.out.println("===== 노래 목록 =====");
		/*
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] != null) {
			songs[i].info();    // null.info(); -> NullPointerEception(:존재하지 않는 애가 무언갈 하려고 할 때 발생)
			}
		}
		*/
		for (int i = 0; i < idx; i++) {
			songs[i].info();
		}
	}
	
	
}
