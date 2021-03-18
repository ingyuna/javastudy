package quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		// 월급쟁이
		SalaryMan staff1 = new SalaryMan("james", 300);
		SalaryMan staff4 = new SalaryMan("brown", 300);
		
		
		
		// 판매직
		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(2000);   // 1000당 70이니까 2000이면 140 여기에 위에 100 더하니까 240
		
		
		// 알바
		Alba staff3 = new Alba("david");
		staff3.setPayPerHour(1);   // 다른 애들이랑 맞출려고 만원
		staff3.setTimes(200);
		
		
		// 회사
		Company company = new Company(10);
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.hireStaff(staff4);
		company.staffInfo();           // Alba, SalaryMan, SlaesMan에는 Infor가 없다.  그래서 여기서 다시 info()를 오버라이드해서 name, pay를 만들어준다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
