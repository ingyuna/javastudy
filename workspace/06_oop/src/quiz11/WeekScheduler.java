package quiz11;

import java.util.Scanner;

public class WeekScheduler {

	// field
	private int nthWeek;    // n번째 week
	private Day[] week;
	private String[] weekNames = { "일", "월", "화", "수", "목", "금", "토" };
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		week = new Day[7];    // schedule이 있건 없건 정보 출력할 수 있게 해놓음.
		for (int i = 0; i < week.length; i++) {
			week[i] = new Day();     // 괄호를 열어서 7개의 Day 객체를 미리 만들어준다. 초기화는 다 null 값으로 비어있다(=아무 스케쥴 없음)
		}			
	}
	
	// method
	
	// 1. run()
	public void run() {
		while (true) {
			menu();  // 방금 아래에서 만든 메뉴를 보여준다.
			System.out.println("작업 선택 >>> ");
			int choice = sc.nextInt();
			sc.nextLine();   // choice 입력 뒤에 남아 있는 엔터를 제거하기 위한 코드
			switch (choice) {
			case 1 : makeSchedule(); break;
			case 2 : deleteSchedule(); break;
			case 3 : updateSchedule(); break;
			case 4 : searchSchedule(); break;
			case 5 : printAllSchedule(); break;
			case 0 : exit();   return;  // run() 메소드의 실행을 종료하는 코드     // break;는 생략가능. exit 하고 끝낼거기때문에.
			default : System.out.println("없는 작업입니다. 다시 입력하세요.");
			}
		}
	}
	
	// 2. menu()
	public void menu() {
		System.out.println("=====스케쥴러====");
		System.out.println("1. 스케쥴 만들기");   // 공백을 입력할 수 있게 해줄거임 : nextLine();  choice에서 1을 입력하고 엔터를 누르면 바로 nextLine으로 넘어갈거다.
		System.out.println("2. 스케쥴 삭제하기");
		System.out.println("3. 스케쥴 수정하기");
		System.out.println("4. 스케쥴 조회하기");
		System.out.println("5. 전체 스케쥴 보기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("==================");
	}
	
	// 3. exit()
	public void exit() {
		System.out.println("스케쥴러를 종료합니다.");
		sc.close();
	}
	
	
	// 4. makeSchedule()
	public void makeSchedule() {
		System.out.println("===스케쥴 만들기===");
		System.out.println("스케쥴을 등록할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1); // 0 <= 추출할문자열 < 1    // 얘 추가
		sc.nextLine();     // 요일 입력 뒤에 남아 있는 엔터 제거. 그래서 아래 sc.nextLine();으로 새로운 입력을 받는데 문제가 없는거.
		for (int i = 0; i < week.length; i++) {     // 어떤 요일에 저장해야하는지 위치를 알아야하니까 for문을 써서 순회한다.
			if (weekNames[i].equals(weekName)) {    // i 값을 알아내기 위해서 이렇게 해준다. 무슨 요일인지.
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.print(weekName + "요일의 신규 스케쥴 >>> ");
					String schedule = sc.nextLine();
					week[i].setSchedule(schedule);
					System.out.println(weekName + "요일에 신규 스케쥴이 저장되었습니다.");					
				} else {
					System.out.println(weekName + "요일은 이미 스케쥴이 있습니다.");
				}
				break;    // for문 종료 
			}
			
		}			
		
	}
	
	// 5. deleteSchedule()
	public void deleteSchedule() {
		System.out.println("===스케쥴 삭제===");
		System.out.println("스케쥴을 삭제할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();    // 만약 "화요일"이라고 입력을 했다면,   // 여기에는 nextLine();이 없으니까 아래 \n이 sc.next();에 들어갈 일이 없다. 
		weekName = weekName.substring(0, 1); // 0 <= 추출할문자열 < 1
		// weekName = weekName.charAt(0);  // 오류가 나서 쓰지 않은거임. 이유는 week는 타입이 String이니까.charAt의 타입은 character. 그래서 위에처럼 타입이 String이기때문에 타입에 맞는 메소드를 호출했다.
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].contentEquals(weekName)) {   // 같은 요일의 스케쥴을 발견했냐.
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케쥴이 없습니다.");
				} else {
					System.out.println(weekName + "요일의 스케쥴은 다음과 같습니다.");
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.println("삭제할까요(Y/N) ? >>> ");
					String yesNo = sc.next();
					yesNo = yesNo.substring(0, 1);
					if (yesNo.equalsIgnoreCase("Y")) {
						week[i].setSchedule(null);   // 처음에 null 값이었으니까. 그럼 삭제하면 데이터가 원래대로 초기화된다.
						System.out.println(weekName + "요일의 스케쥴이 삭제되었습니다.");
					} else {
						System.out.println("삭제가 취소되었습니다.");
					}
				}
				break;            // 중복된 요일을 발견하지 않았으면 바로 여기로 와서 break가 실행된다.
			}
		}
		
		
		
			
		}
		
		
	// 6. updateSchedule() : 있으면 수정, 없으면 새로 등록
	public void updateSchedule() {
		System.out.println("===스케쥴 수정===");
		System.out.println("스케쥴을 수정할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);
		sc.nextLine();    // 엔터제거
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케쥴이 없습니다.");
					System.out.println("새로운 스케쥴을 등록하시겠습니까?(Y/N)? >>> ");
					String yesNo = sc.next();  // Y,N이 아닌 YES NO 문자열로 입력할 사람들을 위해
					sc.nextLine();
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') { // String이 아니기때문에 equals를 쓰면 안됨. 그래서 == 이걸 쓴다. 
					   System.out.println(weekName + "요일의 신규 스케쥴 입력 >>> ");
					   String schedule = sc.nextLine();
					   week[i].setSchedule(schedule);
					   System.out.println(weekName + "요일에 신규 스케쥴이 저장되었습니다.");
					} else {
						System.out.println("스케쥴 수정이 취소되었습니다.");
					}
				} else {
					System.out.println(weekName + "요일이ㅡ 스케쥴을 확인합니다.");
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.println("스케쥴을 수정할까요(Y/N)? >>> ");
					String yesNo = sc.next();
					sc.nextLine();
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') {
							System.out.println(weekName + "요일의 수정 스케쥴 입력 >>> ");
							String schedule = sc.nextLine();
							week[i].setSchedule(schedule);
							System.out.println(weekName + "요일의 스케쥴이 수정되었습니다.");
					
				}else {
					System.out.println("스케쥴 수정이 취소되었습니다.");
				}
			}
				break;
		}
	}
	}
	// 7. searchSchedule()
	public void searchSchedule() {
		System.out.println("===스케쥴 조회===");
		System.out.println("스케쥴을 조회할 요일(일~토) 입력 >>> ");  // 최요일은 존재하지 않습니다. (=> 잘못된 요일을 입력하면 이렇게 출력하는거 만들기) 
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);   // weekName.charAt(0) + "";  이렇게 써도 무방. 타입만 맞으면 됨. 화요일 이렇게 길게 쓸 사람들을 위해 설정해주는것. 
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				System.out.println(weekName + "요일의 스케쥴입니다.");
				week[i].info();            // 스케쥴이 있다 없다는 조회할 필요 없음. 어차피 나와있으니까.
				return;							// for문이 아니라 searchScheduel이라고 하는 메소드의 종료
				
			}
			
		}
		System.out.println(weekName + "요일은 존재하지 않습니다.");      // 잘못된 요일을 입력했을때 출력값. 
	}
	
	// 8. printAllSchedule()
	public void printAllSchedule() {
		System.out.println("===" + nthWeek + "주차 전체 스케쥴===");
		/*
		for (Day day : week)   {    // 단순 출력이니까 향상 for문을 써준다.  근데 이거는 weekNames[i] 얘를 불러낼 방법이 없으니까 지금은 안됨. 배열을 2개 써야한다. 
			day.info();
		}
		*/
		for (int i = 0; i < week.length; i++) {
			System.out.println(weekNames[i] + "요일 스케쥴: ");
			week[i].info();
		}
	}
	
	
	
	
}
