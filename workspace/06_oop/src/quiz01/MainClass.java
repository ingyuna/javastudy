package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Watch watch = new Watch(10, 45, 30);   // 10시 45분 30초
		
		watch.addHour(25);  // 25시간 후 (=실제로는 한시간 후. 두 바퀴 돌고 하루가 간거니까)
		watch.addMinute(61); // 61분 후 (1시간 1분 후)
		watch.addSecond(3661); // 3661초 후 (1시간 1분 1초 후)  => (60 * 60)
		
		watch.see();  // 13시 47분 31초            (분에서 1분, 초에서 1분 지났으니까 총 2분 지난거임.그래서 47분)  
	}

}
