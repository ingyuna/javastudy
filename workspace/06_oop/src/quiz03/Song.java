package quiz03;

public class Song { // 이런걸 초기 프로토타입이라고 한다. 나중에는 작곡가도 넣어주고 할거임.

	// field
	private String title;
	private double playTime;
	
	// constructor
	public Song (String title, double playTime) {
		this.title = title;    // 넘겨주기
		this.playTime = playTime;
	}
		
	// method
	public void info() {
		System.out.println(title + ", " + playTime);
	}
		
		
		
		
	
	
}
