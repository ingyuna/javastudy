package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	
	
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
			case 2 : updateStaff(); break;
			case 3 : deleteStaff(); break;
			case 4 : selectOne(); break;
			case 5 : selectList(); break;
			case 6 : System.out.println("프로그램을 종료합니다.");
					 return;
			default : System.out.println("다시 선택하세요."); 	
			}	
		}
	}
	
	
	public void insertStaff() {             // field 하나 만들고 insert할 때 마다 + + 시켜주기
		StaffDto staffDto = new StaffDto();    // --> 위에 field에 dao는 만들었는데 Dto는 만들지 않은 이유는?
												// Dto 자체는 이렇게 new로 해서 refresh해서 써주는게 좋다. 
												// 왜냐하면 들어가는 내용이 달라지기 때문에. 
		
		System.out.println("신규 사원 이름 >>> ");
		String name = sc.next();
		staffDto.setName(name);
		
		System.out.println("신규 부서 이름 >>> ");
		String department = sc.next();
		staffDto.setDepartment(department);        // 참고로 DATE는 안함. SYSDATE라고 하는걸로 오라클해서 하기로 했으니까.
		
		int no = dao.selectMaxNo();
		staffDto.setNo(no + 1);
		
		int result = dao.insertStaff(staffDto);	   // DB에 삽입 
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
	public void updateStaff() {
		System.out.println("수정할 사원 번호 입력 >>> ");
		int no = sc.nextInt();
		
		StaffDto staffDto = dao.selectOneByNo(no);
		
		System.out.println("수정할 내용을 선택하세요(1:이름, 2:부서) >>> ");
			int choice = sc.nextInt();
			if (choice ==1) {
			System.out.println("새로운 사원 이름 입력 >>> ");
			String name = sc.next();
			staffDto.setName(name);
		} else if (choice ==2) {
			System.out.println("새로운 부서 이름 입력 >>> ");
			String department = sc.next();
			staffDto.setDepartment(department);
		} else {
			System.out.println("잘못된 선택입니다.수정이 취소됩니다.");			
			return;								
		}
			int result = dao.updateStaff(staffDto);									
			System.out.println(result + "명의 회원정보가 수정되었습니다.");	
		
			
	}
	public void deleteStaff() {
		System.out.println("삭제할 사원 번호 입력 >>> ");
		int no = sc.nextInt();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		int result = dao.deleteStaff(staffDto);
		System.out.println(result + "명의 회원정보가 삭제되었습니다.");	
	}
	
	public void selectOne() {
		System.out.println("조회할 사원 번호 입력 >>> ");
		int no = sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		if (staffDto == null) {
			System.out.println("사원번호 " + no + "를 가진 사원이 없습니다.");
		} else {
			System.out.println(staffDto);
		}
	}
	public void selectList() {
		
		List<StaffDto> staffList = dao.selectList();
		
		System.out.println("총 사원 수: " + staffList.size() + "명");
		for (StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
	
}
