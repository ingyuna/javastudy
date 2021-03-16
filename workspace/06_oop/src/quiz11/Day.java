package quiz11;

public class Day {

	// field
	private String schedule;

	
	// constructor
	
	
	// method
	
	public String getSchedule() {
		return schedule;
	}
	
	public void setSchedule(String schedule) {    // 이걸로 스케쥴을 수정할 수 있음.
		this.schedule = schedule;
	}
	
	public void info() {
		if (schedule == null || schedule.isEmpty()) {           // null 또는 빈문자열(" ")  / schedule이 빈 문자열(" ")일때 검사하는 방법은 .isEmpty
			System.out.println("[없음]");
		} else {
			System.out.println("[" + schedule + "]");
		}
	}
	
}
