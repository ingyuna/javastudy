package ex07_exception_class;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {

	// field 
	private int errorCode;
	
	// constructor
	public WithdrawException(String message, int errorCode) {
		super(message);     // 메세지는 슈퍼클래스한테 전달해주고,
		this.errorCode = errorCode;  // 에러코드는 필드에 저장해준다.
	}

	// method
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
}


