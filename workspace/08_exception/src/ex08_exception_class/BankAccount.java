package ex08_exception_class;

public class BankAccount {

	// field
	private String accNo;
	private long balance;      // in 잔액이 21억 넘으면 안되니까 long으로 써준다.
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// method
	
	public void deposit(long money) throws BankAccountException {  
		if (money <= 0)  	 {
			throw new BankAccountException(money + "원은 입금할 수 없습니다.", 1000);
		}   
		balance += money;
	}
	
	// 실제로 출금된 금액을 반환하는 메소드 
	public long withdraw(long money) throws BankAccountException {   // long money : 요청금액(반환되거나 안될수도 있다)     // 출금 금액 받아오기
		if (money <= 0) {   
			throw new BankAccountException(money + "원은 출금할 수 없습니다", 2000);		
		} else if (money > balance) {
			throw new BankAccountException("잔액이 부족합니다.", 2001);
		}	
		balance -= money;
		return money;   // 0 아니면 money가 반환이 된다. 
	}
	
	public void inquiry() {
		System.out.println("계좌번호: " + accNo + "(" + balance + "원)" );
	}
	
	public void transfer(BankAccount you, long money) throws BankAccountException {   
		you.deposit(withdraw(money));         // 받는다고 해서 무조건 try ~ catch 할 필요는 없다. transfer 같은 경우에 이렇게 던지는 방식으로 재구성 해줌. 
		
//		you.deposit(withdraw(money));            
//	}
	
	
	}
	
}
