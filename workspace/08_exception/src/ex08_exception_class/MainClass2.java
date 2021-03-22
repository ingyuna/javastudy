package ex08_exception_class;

public class MainClass2 {

	// main() 메소드가 던진 예외는 JVM이 처리합니다. 
	
	public static void main(String[] args) throws BankAccountException {
		
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("9999", 10000);
		
		me.deposit(10000);     // 입금을 하려면 try ~ catch가 필요하다. 근데 여기서 try 안하고 위에 메인 메소드에다가 던져도 가능함.
		me.withdraw(10000);
		me.transfer(you, 5000);
		me.inquiry();
		
	}

}
