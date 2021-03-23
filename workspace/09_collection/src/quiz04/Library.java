package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	// field
	private String name;
	private List<Book> books = new ArrayList<Book>();
	
	// constructor
	public Library(String name) {
		this.name = name;
	}
	
	// method
	public void booksInfo() {
		System.out.println("도서관: " + name);
		for (Book book : books) {      // Book 타입의 book, 꺼낼곳은 books
			System.out.println(book);    // @data를 만들어두었기 때문에 알아서 나온다. 
		}
	}
	public void addBook(Book book) {
		books.add(book);   // 크기가 유동적으로 변할 수 있기때문에 인덱스 길이, limit 체크 할 필요 노노. 
	}
	public void removeBook(int bNo) {
		for (Book book : books) {
			if (book.getBNo() == bNo) {
				books.remove(book);     // .remove -> Object로 선택
				break;
			}
		}
		
		
		/*
		int removeIdx = -1;      // -1인 이유 : 초기화값이 -1. 변하지 않았다는말. 
		for (int i = 0, length = books.size(); i < length; i++) {
			if (books.get(i).getBNo() == bNo) {                 // books.get(i) : 꺼내온(저장된) 책 한 권
				removeIdx = i;
				break;
			}
		}
		if (removeIdx == -1) {
			System.out.println(bNo + "번 Book이 없습니다.");
		} else {
			books.remove(removeIdx);
			System.out.println(bNo + "번 Book이 삭제되었습니다.");
		}
	*/	
	}
	
}
