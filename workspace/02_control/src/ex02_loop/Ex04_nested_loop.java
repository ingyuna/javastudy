package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		for (int out = 1; out <= 10; out++) {   // out == 1
			
			for (int in = 10; in <= 50; in += 10) {    //10씩 늘려줌  in == 10~50
 			
				System.out.println(out + ", " + in);
		}
	}

		// 1주차 1일차 1교시입니다.
		// 1주차 1일차 2교시입니다.
		// ...
		// 총 3주차
		// 총 5일
		// 총 8교시
		
		
		for (int week = 1; week <= 3; week++) {
			for (int day = 1; day <= 5; day++) {
				for (int hour = 1; hour <= 8; hour++) {
					System.out.println(week + "주차" + day + "일차" + hour + "교시입니다.");
				}
			}
			
		}
		
  }

}