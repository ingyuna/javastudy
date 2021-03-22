package ex08_exception_class;

public class MainClass {
	
	public static void main(String[] args) {
	
	BankAccount me = new BankAccount("1111", 10000);
	BankAccount you = new BankAccount("9999", 10000);
	
	// 입금, 출금, 이체
	try {
		//me.deposit(-10000);
		// me.withdraw(-50000);
		me.transfer(you, 50000);
	} catch (BankAccountException e) {
		System.out.print("에러코드[" + e.getErrorCode() + "] ");
		System.out.println(e.getMessage());		
	} finally {
		me.inquiry();
		you.inquiry();
	}
	
		
}
	
}
