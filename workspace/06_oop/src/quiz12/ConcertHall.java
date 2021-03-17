package quiz12;

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
		while (true) {
			menu();
			System.out.println("작업 선택 >>> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 : reservation(); break;
			case 2 : cancel(); break;
			case 3 : inquiry(); break;
			case 4 : info(); break;
			case 0 : exit(); return;     // break하면 무한루프를 못나간다. void니까 return;으로 끝낸다.
			default : System.out.println("잘못된 작업입니다. 다시 시도하세요.");
			} 
		}
	}
	public void menu() {
		System.out.println("====예매 프로그램====");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 프로그램 종료");
		System.out.println("=====================");	
	}
	// 예매
	public void reservation() {
		System.out.println("예매할 좌석 타입(S, R, A, B) 입력 >>> ");   // 위에 예매가 있는데 여기다가 또 하는 이유는 좌석 타입을 정하지 않았었기 때문에.
		char seatType = sc.next().charAt(0);
		for (int i = 0; i < seatTypes.length; i++) {
			if (seatType == seatTypes[i]) {
				seatGroups[i].reservation();
			}
		}
	}
	// 예매 취소
	public void cancel() {    // 위에 예매에서 복붙해서 수정만 해주기.
		System.out.println("예매 취소할 좌석 타입(S, R, A, B) 입력 >>> ");      // 대소문자 구분해서 입력해야한다.
		char seatType = sc.next().charAt(0);
		for (int i = 0; i < seatTypes.length; i++) {
			if (seatType == seatTypes[i]) {
				seatGroups[i].cancel();
			}
		}
	}
	// 조회
	public void inquiry() {
		System.out.println("조회할 사용자 이름 입력 >>> ");
		String name = sc.next();
		for (int i = 0; i < seatGroups.length; i++) {   // S, R, A, B
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
 			for (int j = 0; j < seats.length; j++) {
				if (seats[j].getName() != null && seats[j].getName().equals(name)) {    // 모든 seat들을 다 조회한다. null 하려면 name.equals(seats[j].getName() 이렇게 해도됨.
					System.out.print(seatTypes[i] + "타입 " + (j + 1) + "번 좌석이 " + name + "님에게 예약되어 있습니다.");
					return;     // 조회가 더이상 될 수 없도록 끝마쳐준다. 찾고 바로 끝. 
				}
			}
			
		}
		System.out.println(name + "님의 예매 정보가 없습니다.");
	}
	// 전체 예매 현황
	public void info() {
		System.out.println("홀 : " + hallName);
		System.out.println("예매 총액 : " + getTotalCharge() + "원");
		for (SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
			System.out.println();
		}
	}
	// 전체 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for (SeatGroup seatGroup : seatGroups) {
			total += seatGroup.getTotalCharge();
		}
		return total;
	}
	// 프로그램 종료
	public void exit() {
		System.out.println(hallName + "예매 프로그램을 종료합니다.");
		sc.close();            // * 스캐너는 언제 닫아야될지 모르겠으면 안닫아도 된다.
	}
	
}
