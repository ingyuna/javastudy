package quiz12;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertHall {
	
	// field
	private String hallName;
	private char[] seatTypes = { 'S', 'R', 'A', 'B' };
	private int[] seatCounts = { 10, 10, 10, 10 };
	private int[] charges = { 200000, 150000, 100000, 50000 };
	private SeatGroup[] seatGroups;   
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public ConcertHall(String hallName) {     // main 클래스 concertHall을 만들텐데 hallName만 주면된다. 나머지는 다 값이 있음. 그래서 매개변수는 hallName으로 끝.
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[seatTypes.length];   //  배열 생성.    seatGroup[4] 이렇게 여기서 4개 대신 사용할 수 있는건, seatType의 길이다. seatType에 따라서 (지금 4개니까) 결정.
		// SeatGroup 생성
		for (int i = 0; i < seatGroups.length; i++) {  // seatTypes.lenght; 도 가능함
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);   // 각 각 인덱스 i 꺼내오면 됨.
			
		}
}
	// method
	public void run() {
		for (int i = 0; i < seatGroups.length; i++) {
			System.out.println(seatTypes[i]);
			System.out.println(Arrays.toString((Seat[])seatGroups[i].getSeats()));
		}
	}
	
	

}
