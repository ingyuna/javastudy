package ex07_exception_class;

public class BankAccount {

	// field
	private String accNo;
	private long balance;      
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// method
	
	public void deposit(long money) throws DepositException {  
		if (money <= 0)  	 {   
			throw new DepositException(money + "원은 입금할 수 없습니다.");
			              // return;은 제거. 어차피 위에서 던지고 끝나기 때문에 여기까지 오지도 않는다.
		}   
		balance += money;
	}
	
	// 실제로 출금된 금액을 반환하는 메소드 
	public long withdraw(long money) throws WithdrawException {   // long money : 요청금액(반환되거나 안될수도 있다)     // 출금 금액 받아오기
		if (money <= 0) {   // 2가지의 제약조건이 있었음
			throw new WithdrawException(money + "원은 출금할 수 없습니다", 2000);
		} else if (money > balance) {
			throw new WithdrawException("잔액이 부족합니다.", 2001);
		}	
		balance -= money;
		return money;   // 0 아니면 money가 반환이 된다. 
	}
	
	public void inquiry() {
		System.out.println("계좌번호: " + accNo + "(" + balance + "원)" );
	}
	
	public void transfer(BankAccount you, long money) {   // 인수 2개 필요
		// 내 돈은 줄어든다. (출금)
		// withdraw(money);
		// 네 돈은 늘어난다. (입금)
		// you.deposit(money);
							// 이렇게 짜면 돈이 7000원이 모자른데도 쟤한테 7000원을 입금해줘서 9999 계좌가 22000원이라고 나온다. 
							// 그래서 위에 코드를 수정해줌. public long withdraw(long money) 여기랑 return 0; 으로.
		// 내 통장에서 출금된 금액을 네 통장에 입금해 준다.
		
		try {
			you.deposit(withdraw(money));            // 괄호안에 있는걸 우선처리 -> 바깥쪽으로 한단계씩 나옴. (0, money)
	} catch (DepositException e) {
		System.out.println(e.getMessage());
	} catch (WithdrawException e) {
		System.out.println(e.getMessage());
		System.out.println("예외코드: " + e.getErrorCode());
	}
}	
	
	
	
}
