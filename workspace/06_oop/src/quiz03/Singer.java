package quiz03;

public class Singer {  // 이런걸 초기 프로토타입이라고 한다. 나중에는 작곡가도 넣어주고 할거임.

	// field
	private String name;
	private Song song;    // private Song[] songs;  나중에 궁극적으로는 이렇게 배열로 바뀌는게 목적.
	
	
	// constructor
	public Singer(String name) {
		this.name = name;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Song getSong() {
		return song;
	}


	public void setSong(Song song) {
		this.song = song;
	}
	
	// method 
	
	public void info() {
		System.out.println(name);
		song.info();		
	}
	
	
	
	
	
}
