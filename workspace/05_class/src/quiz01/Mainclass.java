package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class Mainclass {

	public static void main(String[] args) {
	
		
		Book b = new Book();   // 책은 따로 하나 만들어져있고 그걸 저장할 수 잇는 참조값이 b에 저장되어 있는거.
		
		b.title = "어린왕자";
		b.author = "생텍쥐베리";
		b.price = 10000;
		b.stock = 20;
		Calendar date = Calendar.getInstance();     // -> sql로 고치기 
		date.set(2020, 0, 10);   // 2020-01-10
		long timestamp = date.getTimeInMillis();
		b.pubDate = new Date(timestamp);    // sql 데이터는 이 코드밖에 없음
		b.isBest = true;
		
		// 여기까지 임의의 값 세팅 완료
		
		
		System.out.println(b.title);
		System.out.println(b.author);
		System.out.println(b.price);
		System.out.println(b.stock);
		System.out.println(b.pubDate);
		System.out.println(b.isBest ? "베스트셀러" : "일반서적");
		
		
		

	}

}
