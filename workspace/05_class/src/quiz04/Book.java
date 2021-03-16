package quiz04;

public class Book {

	// field
	String title;
	String writer;
	int price;
	
	
	
	// method
	void set(String t, String w, int p) {
		title = t;
		writer = w;
		price = p;
	}
	void set(String t, String w) {
		set(t, w, 0);
	}
	void set(String t, int p) {
		set (t, "미상", p);
	}
	void info() {
		String str = "제목: " + title + ", 저자: " + writer + ", 가격: " + price + "원";
		System.out.println(str);
	}
}
