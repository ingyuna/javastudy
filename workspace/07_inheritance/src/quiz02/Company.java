package quiz02;

public class Company {

	// field
	private Staff[] staffList;
	private int idx;
	
	// constructor     -> 타이핑해서 직접 만들거.
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
	}
	
	// method
	public void hireStaff(Staff staff) {         // hireStaff(new SalaryMan());  이게 가능하다. 서브클래스인 SalaryMan타입을 슈퍼클래스인 staff 타입에 저장할 수 있다. 
		if(idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다.");
			return;       // 더 이상 증가할 수 없도록 마무리.
		}
		staffList[idx++] = staff;   // 호출할때마다 증가하는 idx
	}
	public void staffInfo() {
		for (Staff staff : staffList) {
			if(staff != null) {
				staff.info();
			}
		}
	}
	
	
	
}
