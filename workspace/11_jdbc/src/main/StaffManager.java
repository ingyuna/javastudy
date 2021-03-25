package main;

import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no;     // = 0으로 셋팅되어 있음.
	
	
	// method
	public void menu() {
		System.out.println("======사원관리프로그램=====");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 조회");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("===========================");
	}
	public void execute() {
		while (true) {
			menu();
			System.out.println("선택(1~6) >>> ");
			switch (sc.nextInt()) {			
			case 1 : insertStaff(); break;
			case 2 :  
			case 3 :
			case 4 :
			case 5 :
			case 6 : System.out.println("프로그램을 종료합니다.");
					 return;
			default : System.out.println("다시 선택하세요."); 	
			}	
		}
	}
	
	
	public void insertStaff() {
		no++;                 // field 하나 만들고 insert할 때 마다 + + 시켜주기
		System.out.println("사원 이름 >>> ");
		String name = sc.next();
		System.out.println("부서 이름 >>> ");
		String department = sc.next();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		staffDto.setName(name);
		staffDto.setDepartment(department);        // 참고로 DATE는 안함. SYSDATE라고 하는걸로 오라클해서 하기로 했으니까.
		int result = dao.insertStaff(staffDto);	   // DB에 삽입 
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
	
}
