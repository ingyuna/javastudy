package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		
		
		// java.sql.Date
		//  Ex02_Date 이 2번말고 얘를 쓰자는 얘기. 
		// DB의 Date타입에 맞게끔 wrapping 처리한 클래스입니다. (=추가처리해놨다는 뜻)
		
		long date = System.currentTimeMillis();
		Date today = new Date(date);       // new Date를 하긴하는데 평생 쓸 일이 없기때문에 외울필요 없다.

		System.out.println(today);
	}

}
