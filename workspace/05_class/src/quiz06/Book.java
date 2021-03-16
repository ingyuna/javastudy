package quiz06;

public class Book {

	// field
	String title;
	String writer;
	int price;
	
	Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	Book(String title, int price) {
		this(title, "미상", price);
	}
	Book() {
		// this("없음", "미상", 0);
		this("없음", 0);
	}
	
	void info() {
		String str = "제목: " + title + ", 저자: " + writer + ", 가격: " + price + "원";
		System.out.println(str);
	}
	
}
