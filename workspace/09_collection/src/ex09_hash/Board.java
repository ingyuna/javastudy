package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	// field
	private int bNo;
	private String title;
	private String writer;
	
	// method
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

}
	/*
	   ==== 직접 작성한 hashCode()와 equals() 메소드 ====
	
	@Override
	public int hashCode() {
		// return title.length();   // title의 글자수가 같으면 같은 Board의 가능성이 있다. -> 얘도 가능. 
										  // return 1; // : 모든 Board는 해시코드가 1이다. -> 이건 가능하나 성능이 쓰레기임. 모든 Board를 분류. 
		return title.length() + writer.length(); // title의 글자수 + writer의 글자수가 같으면 같은 Board의 가능성이 있다.
						// 실제로는 이렇게 로직 짤 필요 없음. 이클립스가 알아서 만들어줌. 
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // board1.equals(board1)  : 나하고 전달받은거 하고 같을때.
			return true;
		}
		if (obj instanceof Board) {
			Board board = (Board)obj;
			return this.bNo == board.bNo;  // 게시글번호(bNo)가 같으면 같은 Board입니다.
		} 
		return false;   // board1.equals(member) => 여기가 false인 이유 : 전달받은게 Board가 아니다. board 대신 member 이런게 온거. 
	}
	/*




/*
 	HashSet에 Board를 저장하고자 합니다.
 	동일한 Board의 경우 저장이 안 되도록 설정해야 합니다.
 	
 	1. 자바의 기본 동작
 	   1) 저장할 Board의 해시코드를 확인합니다. (저장된 주소)
 	   2) 같은 해시코드를 가지고 있는 Board가 있습니까?  -> 없다. Board를 만드려면 new를 해야하는데 new는 무조건 다른 메모리에 만들기때문에 무조건 다르다. 
 	   3) 따라서, 같은 Board는 없다고 판단합니다. 
 	   4) 무조건 저장됩니다. 
 
 	2. 추가해야 할 작업
 		1) 같은 Board는 같은 해시코드를 가질 수 있도록 hashCode() 메소드를 오버라이드합니다.
 		2) 같은 Board인지 비교할 수 있는 equals() 메소드를 오버라이드합니다.   * 참고로 Object의 equals() = 주소 비교하고 끝. 쓰레기임. 비교 자체가 안되서 다시 만들어야한다.  
 		3) 같은 해시코드를 가지고, equals() 결과가 true이면 동일한 Board가 있다고 판단하므로
 		   저장되지 않습니다.
 */

/*
  	==== 최종결론 ====
  	Hash 기반의 컬렉션프레임워크(HashSet, HashMap 등)에
  	저장할 객체들은 
  	모두 [Source] - [Generate hashCoade() and equals()...]를 추가해 줍니다.
 */

