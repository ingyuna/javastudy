package ex02_byte;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamMainClass {

	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("board.dat"));
			
			Board board = (Board)ois.readObject();   // 객체를 저장한다고 하면 타입이 object라고 밖에 될 수 없으니까.
			System.out.println(board);
			
			List<Board> boardList = (ArrayList<Board>)ois.readObject();
			for (Board b : boardList) {
				System.out.println(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (ois != null) { ois.close(); }
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		

	}

}
