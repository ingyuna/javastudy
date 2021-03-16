package quiz12;

import java.util.Scanner;

public class SeatGroup {

	// field
	private char seatType;    // 'S', 'R', 'A', 'B'
	private int charge;    // 요금
	private Seat[] seats;     // seat 타입의 배열. 각 타입마다 좌석의 수가 다르기 때문에 여기서 몇개라고 지정할 수 없다.
	private Scanner sc = new Scanner(System.in);
	
	// contructor
	public SeatGroup(char seatType, int seatCount, int charge) {   // concertHall 입장엥서는 이 seatGroup 자체도 배열이다.왜냐면 등급이 seatType에 들어가는거니까.
		this.seatType = seatType;
		this.charge = charge;    // this. 생략가능
		this.seats = new Seat[seatCount];    // 배열 생성.    배열의 갯수를 아직 정하지 못했기 때문에 이렇게 해준다.  // 여기까지는 아직 seat를 만들지 않았음. 
		// 배열에 실제 Seat 생성 작업
		for (int i = 0; i < seatCount; i++) {
			seats[i] = new Seat();    // 빈 좌석 생성 그래서 ( ) 여기가 비어있음. 만약에 괄호안에 이름이 들어간다라고 하면 누군가 점유를 하고 있는거라 여기서는 필요가 없다 (=좌석을 예약했다는거니까)
		}
	}

	
	// method
	public Seat[] getSeats() {
		return seats;
	}
	
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
}
