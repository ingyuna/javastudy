package quiz01;

public class Watch {
	
	// field
	
	private int hour;
	private int minute;
	private int second;
	
	// constructor
	
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// method
	public void addHour(int hour) {
		this.hour += hour;
		this.hour %= 24;
	}
	
	public void addMinute(int minute) {  // ex: 여기 미닛에 120이 들어가면	
		this.minute += minute;   // 우선 더해준다(45 + 61)
		int hour = this.minute / 60;     // 120을 60으로 나누니까 2분.
		addHour(hour);
		this.minute %= 60;   //위에 minute에서 전달된 인수는 60으로 나뉘게됨
	}
	
	public void addSecond(int second) {
		this.second += second;    // 원래 있던 second에 전달되 second를 우선 더해주자.
		int minute = this.second / 60;
		addMinute(minute);  // 이건 니가 해라
		this.second %= 60;   // 나머지는 내가 가질게
	}
	
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

	
}
